/**
 */
package org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.DirectedParameter;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.ParameterDirectionKind;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicBehaviorsFactoryImpl extends EFactoryImpl implements BasicBehaviorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicBehaviorsFactory init() {
		try {
			BasicBehaviorsFactory theBasicBehaviorsFactory = (BasicBehaviorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelexecution.org/xmof/syntax/commonbehaviors/basicbehaviors"); 
			if (theBasicBehaviorsFactory != null) {
				return theBasicBehaviorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicBehaviorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasicBehaviorsPackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
			case BasicBehaviorsPackage.FUNCTION_BEHAVIOR: return createFunctionBehavior();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BasicBehaviorsPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BasicBehaviorsPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	public void prepareBehaviorForOperation(Behavior behavior,
			BehavioredEOperation operation, boolean addToBehavioredClassifier) {		
		behavior.setName(operation.getName());
		operation.getMethod().add(behavior);
		if (addToBehavioredClassifier) {
			addToOwnedBehavior(operation, behavior);
		}
		addParameters(operation, behavior);
	}
	
	private void addToOwnedBehavior(BehavioredEOperation operation,
			Behavior behavior) {
		if (operation.getEContainingClass() instanceof BehavioredEClass) {
			BehavioredEClass behavioredEClass = (BehavioredEClass) operation
					.getEContainingClass();
			behavioredEClass.getOwnedBehavior().add(behavior);
		}
	}

	private void addParameters(BehavioredEOperation operation, Behavior behavior) {
		if (operation.getEType() != null) {
			DirectedParameter parameter = createDirectedParameter(operation);
			behavior.getOwnedParameter().add(parameter);
			if(behavior instanceof Activity)
				addParameterNode((Activity)behavior, parameter);
		}

		for (EParameter eParameter : operation.getEParameters()) {
			DirectedParameter parameter = createDirectedParameter(eParameter);
			if(behavior instanceof Activity)
				addParameterNode((Activity)behavior, parameter);
		}
	}
	
	private DirectedParameter createDirectedParameter(
			BehavioredEOperation operation) {
		DirectedParameter parameter = KernelFactory.eINSTANCE
				.createDirectedParameter();
		parameter.setEType(operation.getEType());
		parameter.setEGenericType(operation.getEGenericType());
		parameter.setLowerBound(operation.getLowerBound());
		parameter.setOrdered(operation.isOrdered());
		parameter.setUnique(operation.isUnique());
		parameter.setUpperBound(operation.getUpperBound());
		parameter.setDirection(ParameterDirectionKind.RETURN);
		parameter.setName("return");
		return parameter;
	}

	private DirectedParameter createDirectedParameter(EParameter eParameter) {
		DirectedParameter parameter = KernelFactory.eINSTANCE
				.createDirectedParameter();
		parameter.setName(eParameter.getName());
		parameter.setEType(eParameter.getEType());
		parameter.setEGenericType(eParameter.getEGenericType());
		parameter.setLowerBound(eParameter.getLowerBound());
		parameter.setOrdered(eParameter.isOrdered());
		parameter.setUnique(eParameter.isUnique());
		parameter.setUpperBound(eParameter.getUpperBound());
		if(eParameter instanceof DirectedParameter) {
			parameter.setDirection(((DirectedParameter)eParameter).getDirection());
		} else {
			parameter.setDirection(ParameterDirectionKind.IN);
		}
		return parameter;
	}

	private void addParameterNode(Activity activity, DirectedParameter parameter) {
		ActivityParameterNode parameterNode = createParameterNode(parameter);
		parameterNode.setActivity(activity);
		activity.getNode().add(parameterNode);		
	}

	private ActivityParameterNode createParameterNode(
			DirectedParameter parameter) {
		ActivityParameterNode parameterNode = IntermediateActivitiesFactory.eINSTANCE
				.createActivityParameterNode();
		parameterNode.setEGenericType(parameter.getEGenericType());
		parameterNode.setEType(parameter.getEType());
		parameterNode.setLowerBound(parameter.getLowerBound());
		parameterNode.setOrdered(parameter.isOrdered());
		parameterNode.setUnique(parameter.isUnique());
		parameterNode.setUpperBound(parameter.getUpperBound());
		parameterNode.setParameter(parameter);
		parameterNode.setName(parameter.getName());
		return parameterNode;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior createFunctionBehavior() {
		FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
		return functionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsPackage getBasicBehaviorsPackage() {
		return (BasicBehaviorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicBehaviorsPackage getPackage() {
		return BasicBehaviorsPackage.eINSTANCE;
	}

} //BasicBehaviorsFactoryImpl
