package org.modelexecution.fumldebug.core.alf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.modeldriven.alf.parser.Parser;

public class RootNamespaceImpl extends
		org.modeldriven.alf.fuml.impl.units.RootNamespaceImpl {

	private final Map<String, String> pathMap = new HashMap<String, String>();

	public void addPathMapping(String fromPath, String toPath) {
		pathMap.put(fromPath, toPath);
	}

	public void removePathMapping(String path) {
		pathMap.remove(path);
	}

	protected Parser createParser(String path) throws FileNotFoundException {
		String pathTo = getPathMapping(path);
		if(pathTo != null) {
			return createParserFromMappedURL(pathTo);
		} else {
			return super.createParser(path);
		}
	}
	
	private String getPathMapping(String path) { 
		if(pathMap.containsKey(path))
			return pathMap.get(path);
		for (String fromPath : pathMap.keySet()) {			
			if (fromPath.endsWith("/**")) {
				String fromPath_ = fromPath.replaceFirst("\\*\\*", "");
				if(path.startsWith(fromPath_)) {
					return path.replaceFirst(fromPath_, pathMap.get(fromPath));
				}
			}
		}
		return null;
	}

	private Parser createParserFromMappedURL(String path)
			throws FileNotFoundException {
		try {
			URL url = new URL(path);
			InputStream inputstream = url.openConnection().getInputStream();
			return new Parser(inputstream);
		} catch (IOException e) {
			throw new FileNotFoundException();
		}
	}

}
