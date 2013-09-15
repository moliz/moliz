package org.modelexecution.xmof.vm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;
import org.modelexecution.xmof.configuration.profile.ProfileApplicationGenerator;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

public class ProfileApplicationSynchronizerTest {
	
	private XMOFVirtualMachine vm;
	private ProfileApplicationGenerator profileApplicationGenerator;
	private SimplePetriNetFactory spnFactory;
	
	@Before
	public void setup() {
		spnFactory = new SimplePetriNetFactory();	
		
		XMOFBasedModel model = setupXMOFBasedModel();
		setupXMOFVirtualMachine(model);		
		setupProfileApplicationGenerator(model);
	}

	private XMOFBasedModel setupXMOFBasedModel() {
		return new XMOFBasedModel(
				spnFactory.getConfigurationObjectMap().getConfigurationObjects(), spnFactory.getEditingDomain());
	}

	private void setupXMOFVirtualMachine(XMOFBasedModel model) {
		vm =  new XMOFVirtualMachine(model);
		vm.setSynchronizeModel(true);
	}

	private void setupProfileApplicationGenerator(XMOFBasedModel model) {
		profileApplicationGenerator = new ProfileApplicationGenerator(model, spnFactory.getConfigurationProfiles(), spnFactory.getConfigurationObjectMap(), vm.getInstanceMap());
				
		File profileApplicationFile = new File("pa/petrinet.runtime.pa.xmi");
		profileApplicationFile.delete();
		String path = profileApplicationFile.getAbsolutePath();
		URI profileApplicationURI = URI.createFileURI(path);
				
		profileApplicationGenerator.setProfileApplicationURI(profileApplicationURI);
		profileApplicationGenerator.setResourceSet(model.getEditingDomain().getResourceSet());
		profileApplicationGenerator.setEditingDomain(spnFactory.getEditingDomain());
		
		vm.addVirtualMachineListener(profileApplicationGenerator);
	}
	
	@Test
	public void testProfileApplicationCreation() {
		vm.run(spnFactory.getActivity(SimplePetriNetFactory.EMPTY_ACTIVITY), null, null);
		
		assertExistenceOfProfileApplications();
	}

	private ProfileApplication assertExistenceOfProfileApplications() {
		Resource profileApplicationResource = profileApplicationGenerator.getProfileApplicationResource();
		assertEquals(1, profileApplicationResource.getContents().size());
		assertTrue(profileApplicationResource.getContents().get(0) instanceof ProfileApplication);
		ProfileApplication profileApplication = (ProfileApplication)profileApplicationResource.getContents().get(0);
		assertEquals(3, profileApplication.getStereotypeApplications().size());
		assertEquals(1, profileApplication.getStereotypeApplications(spnFactory.getPlace1()).size());
		assertEquals(1, profileApplication.getStereotypeApplications(spnFactory.getPlace2()).size());
		assertEquals(1, profileApplication.getStereotypeApplications(spnFactory.getTransition()).size());
		assertEquals(0, profileApplication.getStereotypeApplications(spnFactory.getNet()).size());
		return profileApplication;
	}	

	@Test
	public void testSettingOfAttributeValue() {
		vm.run(spnFactory.getActivity(SimplePetriNetFactory.SET_ISENABLED_ACTIVITY), spnFactory.getConfigurationObject(spnFactory.getTransition()), null);
		
		ProfileApplication profileApplication = assertExistenceOfProfileApplications();
		StereotypeApplication transitionSa = profileApplication.getStereotypeApplications(spnFactory.getTransition()).get(0);		
		Object transitionIsEnabledValues = transitionSa.eGet(getStereotypeFeature(transitionSa.getStereotype(), spnFactory.getIsEnabledConfAttribute()));
		assertTrue(transitionIsEnabledValues instanceof Collection);
		assertEquals(1, ((Collection<?>)transitionIsEnabledValues).size());
		Object transitionIsEnabledValue = ((Collection<?>)transitionIsEnabledValues).iterator().next();
		assertTrue(transitionIsEnabledValue instanceof Boolean);
		assertTrue((Boolean)transitionIsEnabledValue);
	}
	
	@Test
	public void testAddingOfAttributeValue() {
		vm.run(spnFactory.getActivity(SimplePetriNetFactory.ADD_ISENABLED_ACTIVITY), spnFactory.getConfigurationObject(spnFactory.getTransition()), null);
		
		ProfileApplication profileApplication = assertExistenceOfProfileApplications();
		StereotypeApplication transitionSa = profileApplication.getStereotypeApplications(spnFactory.getTransition()).get(0);		
		Object transitionIsEnabledValues = transitionSa.eGet(getStereotypeFeature(transitionSa.getStereotype(), spnFactory.getIsEnabledConfAttribute()));
		assertTrue(transitionIsEnabledValues instanceof Collection);
		assertEquals(2, ((List<?>)transitionIsEnabledValues).size());
		Object transitionIsEnabledValue1 = ((List<?>)transitionIsEnabledValues).get(0);
		Object transitionIsEnabledValue2 = ((List<?>)transitionIsEnabledValues).get(1);
		assertTrue(transitionIsEnabledValue1 instanceof Boolean);
		assertFalse((Boolean)transitionIsEnabledValue1);
		assertTrue(transitionIsEnabledValue2 instanceof Boolean);
		assertTrue((Boolean)transitionIsEnabledValue2);
	}
	
	@Test
	public void testReplacementOfAttributeValue() {
		vm.run(spnFactory.getActivity(SimplePetriNetFactory.REPLACE_ISENABLED_ACTIVITY), spnFactory.getConfigurationObject(spnFactory.getTransition()), null);
		
		ProfileApplication profileApplication = assertExistenceOfProfileApplications();
		StereotypeApplication transitionSa = profileApplication.getStereotypeApplications(spnFactory.getTransition()).get(0);		
		Object transitionIsEnabledValues = transitionSa.eGet(getStereotypeFeature(transitionSa.getStereotype(), spnFactory.getIsEnabledConfAttribute()));
		assertTrue(transitionIsEnabledValues instanceof Collection);
		assertEquals(1, ((Collection<?>)transitionIsEnabledValues).size());
		Object transitionIsEnabledValue = ((Collection<?>)transitionIsEnabledValues).iterator().next();
		assertTrue(transitionIsEnabledValue instanceof Boolean);
		assertFalse((Boolean)transitionIsEnabledValue);
	}

	@Test
	public void testSettingOfSingleValueAttributeValue() {
		vm.run(spnFactory.getActivity(SimplePetriNetFactory.SET_ISCURRENTLYENABLED_ACTIVITY), spnFactory.getConfigurationObject(spnFactory.getTransition()), null);
		
		ProfileApplication profileApplication = assertExistenceOfProfileApplications();
		StereotypeApplication transitionSa = profileApplication.getStereotypeApplications(spnFactory.getTransition()).get(0);		
		Object transitionIsEnabledValue = transitionSa.eGet(getStereotypeFeature(transitionSa.getStereotype(), spnFactory.getIsCurrentlyEnabledConfAttribute()));
		assertTrue(transitionIsEnabledValue instanceof Boolean);
		assertTrue((Boolean)transitionIsEnabledValue);
	}
	
	private EStructuralFeature getStereotypeFeature(Stereotype stereotype, EStructuralFeature eStructuralFeature) {
		return stereotype.getEStructuralFeature(eStructuralFeature.getName());
	}
}
