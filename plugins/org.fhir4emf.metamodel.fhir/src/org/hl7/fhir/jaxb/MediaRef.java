package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Media;

@XmlRootElement(name = "MediaRefElement")
public class MediaRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Media createInstance() {
		return FhirFactory.eINSTANCE.createMedia();
	}
	
	public static MediaRef valueOf(String id) {
		MediaRef result = new MediaRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}