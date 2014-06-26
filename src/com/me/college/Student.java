//$Id$
package com.me.college;

public class Student extends Person{

	private Course course;
	private Class className;

	public Class getClassName() {
		return className;
	}

	public void setClassName(Class className) {
		this.className = className;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Student(String email, String name, String add, long number, Course course,Class className)
	{
		super.address= add;
		super.contactNumber= number;
		super.name= name;
		this.course= course;
		this.className= className;
	}
}
