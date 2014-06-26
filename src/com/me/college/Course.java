//$Id$
package com.me.college;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private ArrayList<Subject> subjects;
	
	public Course(String courseName, ArrayList<Subject> subjects)
	{
		this.courseName= courseName;
		this.subjects= subjects;
	}
}
