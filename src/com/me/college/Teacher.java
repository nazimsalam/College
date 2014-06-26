//$Id$
package com.me.college;

public class Teacher extends Person{
	
	Subject subject;
	
	public Teacher(String email, String name, String add, long number, Subject subject)
	{
		super.address= add;
		super.contactNumber= number;
		super.name= name;
		this.subject= subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
