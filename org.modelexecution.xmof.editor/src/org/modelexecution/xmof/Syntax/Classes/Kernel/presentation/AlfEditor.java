package org.modelexecution.xmof.Syntax.Classes.Kernel.presentation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.modelexecution.ui.AlfResourceProvider;
import org.modelexecution.ui.internal.AlfActivator;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class AlfEditor extends EditorPart {

	private OpaqueBehavior alfBehavior;

	private Injector alfEditorInjector;

	private EmbeddedEditorModelAccess editorModelAccess;

	private TransactionalEditingDomain editingDomain;

	public AlfEditor(TransactionalEditingDomain editingDomain,
			OpaqueBehavior alfBehavior_) {
		this.editingDomain = editingDomain;
		this.alfBehavior = alfBehavior_;
		alfEditorInjector = AlfActivator.getInstance().getInjector(
				"org.modelexecution.Alf");
		alfBehavior.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				if (concernsUpdateOfOpaqueBehaviorBody(notification))
					editorModelAccess.updateModel("", alfBehavior.getBody()
							.get(0), "");
			}

			private boolean concernsUpdateOfOpaqueBehaviorBody(
					Notification notification) {
				if (notification.getEventType() == Notification.SET) {
					EStructuralFeature bodyFeature = alfBehavior
							.eClass()
							.getEStructuralFeature(
									BasicBehaviorsPackage.OPAQUE_BEHAVIOR__BODY);
					if (bodyFeature.equals(notification.getFeature())) {
						return true;
					}
				}
				return false;
			}
		});
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void createPartControl(Composite parent) {
		IEditedResourceProvider alfResourceProvider = new AlfResourceProvider(
				alfEditorInjector);
		EmbeddedEditorFactory factory = alfEditorInjector
				.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor editor = factory.newEditor(alfResourceProvider)
				.showErrorAndWarningAnnotations().withParent(parent);
		editorModelAccess = editor.createPartialEditor();
		editorModelAccess.updateModel("", alfBehavior.getBody().get(0), "");
		editor.getViewer().getTextWidget().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (alfCodeHasChanged()) {
					String currentAlfCode = getCurrentAlfCode();
					EStructuralFeature bodyFeatureFeature = alfBehavior
							.eClass()
							.getEStructuralFeature(
									BasicBehaviorsPackage.OPAQUE_BEHAVIOR__BODY);
					Command setCommand = SetCommand.create(editingDomain,
							alfBehavior, bodyFeatureFeature, currentAlfCode, 0);
					editingDomain.getCommandStack().execute(setCommand);
				}
			}
		});
	}

	private boolean alfCodeHasChanged() {
		String currentCode = getCurrentAlfCode();
		String originalCode = getOriginalAlfCode();
		return !currentCode.equals(originalCode);
	}

	private String getCurrentAlfCode() {
		return editorModelAccess.getSerializedModel();
	}

	private String getOriginalAlfCode() {
		return alfBehavior.getBody().size() > 0 ? alfBehavior.getBody().get(0)
				: "";
	}

}
