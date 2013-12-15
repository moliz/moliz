package org.modelexecution.fumldebug.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.SuspendEvent;
import org.modelexecution.fumldebug.core.event.TraceEvent;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.ExtensionalValueList;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Semantics.CommonBehaviors.Communications.EventAccepter;
import fUML.Semantics.CommonBehaviors.Communications.ObjectActivation;
import fUML.Semantics.CommonBehaviors.Communications.SignalInstance;
import fUML.Syntax.Actions.BasicActions.InputPin;
import fUML.Syntax.Actions.BasicActions.OutputPin;
import fUML.Syntax.Actions.BasicActions.SendSignalAction;
import fUML.Syntax.Actions.CompleteActions.AcceptEventAction;
import fUML.Syntax.Actions.CompleteActions.StartObjectBehaviorAction;
import fUML.Syntax.Actions.IntermediateActions.CreateObjectAction;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import fUML.Syntax.Activities.IntermediateActivities.ForkNode;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Classifier;
import fUML.Syntax.Classes.Kernel.NamedElement;
import fUML.Syntax.Classes.Kernel.Parameter;
import fUML.Syntax.Classes.Kernel.ParameterDirectionKind;
import fUML.Syntax.Classes.Kernel.Type;
import fUML.Syntax.CommonBehaviors.Communications.Event;
import fUML.Syntax.CommonBehaviors.Communications.Reception;
import fUML.Syntax.CommonBehaviors.Communications.Signal;
import fUML.Syntax.CommonBehaviors.Communications.SignalEvent;
import fUML.Syntax.CommonBehaviors.Communications.Trigger;
import fUML.Syntax.CommonBehaviors.Communications.TriggerList;

public class SignalTest {

	private static ExecutionContext executionContext = ExecutionContext.getInstance();
	
	@BeforeClass
	public static void registerEventListener() {
		executionContext.addEventListener(new ExecutionEventListener() {
			
			@Override
			public void notify(org.modelexecution.fumldebug.core.event.Event event) {
				printEvent(event);
			}
		});
	}
	
	@Test
	public void test1() {
		Class_ classReceivingSignal = ActivityFactory.createClass("ClassReceivingSignal");
		Signal signal = createSignal("Signal");
		createReception("reception of signal", signal, classReceivingSignal);
		Activity activityReceiving = ActivityFactory.createActivity("signal receiving activity");
		classReceivingSignal.setClassifierBehavior(activityReceiving);
		SignalEvent signalEvent = createSignalEvent("signal event", signal);
		Trigger trigger = createTrigger("trigger", signalEvent);
		AcceptEventAction acceptEventAction = createAcceptEventAction(activityReceiving, "acceptEvent", trigger);
		Class_ classAfterSignal = ActivityFactory.createClass("Class created after signal received");
		CreateObjectAction createObjectAction2 = ActivityFactory.createCreateObjectAction(activityReceiving, "create object after signal received", classAfterSignal);
		ActivityFinalNode activityFinalNode = ActivityFactory.createActivityFinalNode(activityReceiving, "final");
		ActivityFactory.createControlFlow(activityReceiving, acceptEventAction, createObjectAction2);
		ActivityFactory.createControlFlow(activityReceiving, createObjectAction2, activityFinalNode);
		
		Activity activitySending = ActivityFactory.createActivity("signal sending activity");
		CreateObjectAction createObjectAction = ActivityFactory.createCreateObjectAction(activitySending, "create object", classReceivingSignal);
		ForkNode forkNode = ActivityFactory.createForkNode(activitySending, "fork");
		StartObjectBehaviorAction startObjectBehaviorAction = createStartObjectBehaviorAction(activitySending, "start object behavior", classReceivingSignal);
		SendSignalAction sendSignalAction = createSendSignalAction(activitySending, "send signal", signal);
		ActivityFactory.createObjectFlow(activitySending, createObjectAction.result, forkNode);
		ActivityFactory.createObjectFlow(activitySending, forkNode, sendSignalAction.target);
		ActivityFactory.createObjectFlow(activitySending, forkNode, startObjectBehaviorAction.object);
		ActivityFactory.createControlFlow(activitySending, startObjectBehaviorAction, sendSignalAction);
		
		executionContext.execute(activitySending, null, null);
		
		ExtensionalValueList extensionalValues = executionContext.getExtensionalValues();
		List<Object_> objectsAtLocus = new ArrayList<Object_>();
		for(ExtensionalValue value : extensionalValues) {
			if(value.getClass() == Object_.class) {
				Object_ object_ = (Object_) value;
				objectsAtLocus.add(object_);
			}
		}
		assertEquals(2, objectsAtLocus.size());
		Object_ objectclass_ = null;
		Object_ objectclassAfterSignal = null;
		for(Object_ object_ : objectsAtLocus) {
			if(object_.types.contains(classReceivingSignal)) {
				objectclass_ = object_;
			} else if(object_.types.contains(classAfterSignal)) {
				objectclassAfterSignal = object_;
			}
		}
		assertNotNull(objectclass_);
		assertNotNull(objectclassAfterSignal);
	}	
	
	@Test
	public void test2() {		
		Signal signal = createSignal("signal");
		SignalEvent signalEvent = createSignalEvent("signal event", signal);
		Trigger trigger = createTrigger("trigger", signalEvent);
		TriggerList triggers = new TriggerList();
		triggers.add(trigger);
		
		Class_ classReceivingSignal = ActivityFactory.createClass("ClassReceivingSignal");
		
		// object which a running state machine instance waiting for a signal
		Object_ objectReceivingSignal = ActivityFactory.createObject(classReceivingSignal);
		registerObjectAtLocus(objectReceivingSignal);
		startObjectBehavior(objectReceivingSignal);
		
		// accepter will be triggered when signal is sent 
		StateMachineEventAccepter accepter = new StateMachineEventAccepter(triggers);
		objectReceivingSignal.register(accepter);
				
		Activity activitySendingSignal = ActivityFactory.createActivity("activity sending signal");
		Parameter parameterObjectReceivingSignal = ActivityFactory.createParameter(activitySendingSignal, "parameter", ParameterDirectionKind.in);
		ActivityParameterNode activityParameterNode = ActivityFactory.createActivityParameterNode(activitySendingSignal, "parameter noce", parameterObjectReceivingSignal);
		SendSignalAction sendSignalAction = createSendSignalAction(activitySendingSignal, "send signal", signal);
		ActivityFactory.createObjectFlow(activitySendingSignal, activityParameterNode, sendSignalAction.target);
				
		Reference referenceObjectReceivingSignal = new Reference();
		referenceObjectReceivingSignal.referent = objectReceivingSignal;
		ParameterValue parameterValueObjectReceivingSignal = ActivityFactory.createParameterValue(parameterObjectReceivingSignal, referenceObjectReceivingSignal);
		ParameterValueList parameterValueList = ActivityFactory.createParameterValueList(parameterValueObjectReceivingSignal);
		executionContext.execute(activitySendingSignal, null, parameterValueList);
		
		// accepter has received sent signal instance
		assertEquals(1, accepter.acceptedSignals.size()); 
	}

	private void startObjectBehavior(Object_ objectReceivingSignal) {
		objectReceivingSignal.objectActivation = new ObjectActivation();
		objectReceivingSignal.objectActivation.object = objectReceivingSignal;
	}

	private void registerObjectAtLocus(Object_ objectReceivingSignal) {
		executionContext.getLocus().add(objectReceivingSignal);
	}
	
	private SendSignalAction createSendSignalAction(Activity activity, String name, Signal signal) {
		SendSignalAction action = new SendSignalAction();
		action.name = name;
		activity.addNode(action);
		
		action.signal = signal;
		
		InputPin target = ActivityFactory.createInputPin("target", 1, 1);		
		action.target = target;
		action.input.add(target);
		
		return action;
	}

	private Signal createSignal(String name) {
		Signal signal = new Signal();
		signal.name = name;
		return signal;
	}
	
	private Reception createReception(String name, Signal signal, Classifier classifier) {
		Reception reception = new Reception();
		reception.signal = signal;
		reception._addFeaturingClassifier(classifier);
		classifier.ownedMember.add(reception);
		return reception;
	}
	
	private AcceptEventAction createAcceptEventAction(Activity activity, String name, Trigger trigger) {
		AcceptEventAction action = new AcceptEventAction();
		action.name = name;
		activity.addNode(action);
		
		action.addTrigger(trigger);
		
		OutputPin result = ActivityFactory.createOutputPin("result", 1, 1);
		action.addResult(result);
		
		return action;
	}
	
	private Trigger createTrigger(String name, Event event) {
		Trigger trigger = new Trigger();
		trigger.event = event;
		trigger.name = "trigger";
		return trigger;
	}
	
	private SignalEvent createSignalEvent(String name, Signal signal) {
		SignalEvent event = new SignalEvent();
		event.name = name;
		event.signal = signal;
		return event;
	}
	
	private StartObjectBehaviorAction createStartObjectBehaviorAction(Activity activity, String name, Type type) {
		StartObjectBehaviorAction action = new StartObjectBehaviorAction();
		
		action.name = name;
		activity.addNode(action);
		
		InputPin object = ActivityFactory.createInputPin("object", 1, 1);
		object.setType(type);
		action.setObject(object);
		
		return action;
	}

	class StateMachineEventAccepter extends EventAccepter {
		List<SignalInstance> acceptedSignals = new ArrayList<SignalInstance>();
		
		TriggerList triggers;
		
		StateMachineEventAccepter(TriggerList triggers) {
			this.triggers = triggers;
		}
		
		@Override
		public void accept(SignalInstance signalInstance) {
			acceptedSignals.add(signalInstance);			
		}

		@Override
		public boolean match(SignalInstance signalInstance) {
			Signal signal = signalInstance.type;
			for(Trigger trigger : triggers) {
				if(trigger.event instanceof SignalEvent) {
					SignalEvent signalEvent = (SignalEvent) trigger.event;
					if(signalEvent.signal == signal) {
						return true;
					}
				}
			}
			return false;
		}
	}

	private static void printEvent(org.modelexecution.fumldebug.core.event.Event event) {
		String msg = null;
		if(event instanceof TraceEvent) {
			if(event instanceof ActivityEntryEvent) {
				ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
				msg = "Activity Entry " + activityEntryEvent.getActivity().name;
			} else if(event instanceof ActivityExitEvent) {
				ActivityExitEvent activityExitEvent = (ActivityExitEvent) event;
				msg = "Activity Exit " + activityExitEvent.getActivity().name;
			} else if(event instanceof ActivityNodeEntryEvent) {
				ActivityNodeEntryEvent activityNodeEntryEvent = (ActivityNodeEntryEvent) event;
				msg = "Node Entry " + activityNodeEntryEvent.getNode().name;
			} else if(event instanceof ActivityNodeExitEvent) {
				ActivityNodeExitEvent activityNodeExitEvent = (ActivityNodeExitEvent) event;
				msg = "Node Exit " + activityNodeExitEvent.getNode().name;
			} else if(event instanceof SuspendEvent) {
				SuspendEvent suspendEvent = (SuspendEvent) event;
				msg = "Suspend at ";
				if(suspendEvent.getLocation() instanceof NamedElement)
					msg += ((NamedElement)suspendEvent.getLocation()).name;
			}
		}
		if(msg != null)
			System.out.println(msg);
	}
}
