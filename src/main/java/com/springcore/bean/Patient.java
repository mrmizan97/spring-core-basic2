package com.springcore.bean;

import java.util.List;

public class Patient {
 
	private int id;
	private String name;
	private int nid;
	private Address address;
	private List<String> contactName;
	private EmergencyContact critiContact;
	private List<EmergencyContact> emergencyContacts;
	public Patient() {
		super();
	}
	public static Patient getInstance(int id, String name) {
		System.out.println("Creating patient using factory method");
		return new Patient(id,name);
	}
//	public void onCreate() {
//	
//		System.out.println("Patient created: "+this);
//	}
//	public void onDestroy() {
//		System.out.println("Patient destroyed: "+this);
//	}
	public Patient(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Patient(int id, String name, int nid) {
		super();
		this.id = id;
		this.name = name;
		this.nid = nid;
	}
	public Patient(int id, String name, int nid, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.nid = nid;
		this.address = address;
	}
	
	public EmergencyContact getCritiContact() {
		return critiContact;
	}
	public void setCritiContact(EmergencyContact critiContact) {
		this.critiContact = critiContact;
	}
	public List<EmergencyContact> getEmergencyContacts() {
		return emergencyContacts;
	}
	public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}
	public List<String> getContactName() {
		return contactName;
	}
	public void setContactName(List<String> contactName) {
		this.contactName = contactName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nid=" + nid + ", address=" + address + ", contactName="
				+ contactName +  "]";
	}
	
}
