package org.modelexecution.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Injector;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class AlfResourceProvider implements IEditedResourceProvider{

	public static final String SYNTHETIC_SCHEME = "synthetic";
	
	private Injector grammarInjector;

	public AlfResourceProvider(Injector grammarInjector) {
		this.grammarInjector = grammarInjector;		
	}
	
	@Override
	public XtextResource createResource() {
		Provider<XtextResourceSet> resourceSetProvider = grammarInjector.getProvider(XtextResourceSet.class) ;
		ResourceSet resourceSet = resourceSetProvider.get();
		IGrammarAccess grammarAccess = grammarInjector.getInstance(IGrammarAccess.class) ;
		Resource grammarResource = resourceSet.createResource(URI.createURI(SYNTHETIC_SCHEME + ":/" + grammarAccess.getGrammar().getName() + ".xtext"));
		grammarResource.getContents().add(EcoreUtil.copy(grammarAccess.getGrammar()));
		XtextResource result = (XtextResource) resourceSet.createResource(URI.createURI(SYNTHETIC_SCHEME + ":/" + grammarAccess.getGrammar().getName() + ".alf"));
		resourceSet.getResources().add(result);
		return result;
	}

}
