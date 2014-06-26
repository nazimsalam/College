//$Id$
package com.me.college.util;

import javax.servlet.http.*;
import org.json.JSONObject;

public class APIServlet extends HttpServlet{

	private void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
        doPost(request, response);
    }
	
	private void doPost(HttpServletRequest request, HttpServletResponse response)
	{
        String operation= request.getParameter("OPERATION");
        //Based on Operation value, we decide which method is to be invoked
        String resp=null;
        if(operation== "ADD_STUDENT")
        {
        	resp= addNewStudent(request);
        }
        else if(operation== "EDIT_STUDENT")
        {
        	resp= editStudentDetails(request);
        }
        else if(operation== "GET_STUDENT_DETAILS")
        {
        	resp= editStudentDetails(request);
        }
        //send/print response to client
    }
	
	private String addNewStudent(HttpServletRequest req)
	{
		// Take values from request
		// Update DB values
		// Construct response as JSONObject
		// return to calling method
	}
	private String editStudentDetails(HttpServletRequest req)
	{
		// Take values from request
		// Update DB values
		// Construct response as JSONObject
		// return to calling method
	}
	private String getStudentDetails(HttpServletRequest req)
	{
		// Take id from request
		// get from DB values
		// Construct response as JSONObject
		// return to calling method
	}
	
}
