package org.modelexecution.xmof.Syntax.Classes.Kernel.presentation;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

public class AlfHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		BehavioredEOperation selectedBehavioredEOperation = getSelectedBehavioredEOperation(HandlerUtil.getCurrentSelectionChecked(event));
		if(selectedBehavioredEOperation != null) {
			IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart activeEditor = activePage.getActiveEditor();
			if(activeEditor instanceof KernelEditor) {
				KernelEditor kernelEditor = (KernelEditor)activeEditor;
				kernelEditor.showAlfCode(selectedBehavioredEOperation);
			}
		}
		return null;
	}

	private BehavioredEOperation getSelectedBehavioredEOperation(ISelection selection) {
		if(selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			if(treeSelection.size() == 1) {
				Iterator<?> iterator = treeSelection.iterator();
				Object selectedObject = iterator.next();
				if(selectedObject instanceof BehavioredEOperation) {
					return (BehavioredEOperation)selectedObject;
				}
			}
		}		
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		if(!super.isEnabled())
			return false;
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = activePage.getSelection();
		BehavioredEOperation selectedBehavioredEOperation = getSelectedBehavioredEOperation(selection);
		if(selectedBehavioredEOperation != null) {
			if (selectedBehavioredEOperation.getMethod().size() == 0) {
				return true;
			}
		}		
		return false;
	}
}
