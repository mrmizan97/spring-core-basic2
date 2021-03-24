package com.springcore.bean;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

	private Patient patient;
	private Map<String, EmergencyContact> contactsMap=new HashMap<String, EmergencyContact>();

	public Map<String, EmergencyContact> getContactsMap() {
		return contactsMap;
	}
public ContactBook() {
	patient=new Patient(10,"Dolly");
}
	public void setContactsMap(Map<String, EmergencyContact> contactsMap) {
		this.contactsMap = contactsMap;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "ContactBook [patient=" + patient + ", contactsMap=" + contactsMap + "]";
	}
	
}
