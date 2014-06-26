//$Id$
package com.me.college;

abstract class Person {
	protected String email;
	protected String name;
	protected long contactNumber;
	protected String address;
	public String getEmailId() {
		return email;
	}
	public void setEmailId(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
