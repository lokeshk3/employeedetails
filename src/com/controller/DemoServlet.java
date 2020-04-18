package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.service.EmployeeOperations;

/**
 * Servlet implementation class DemoServlet
 * Its comment
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");			
			String action = request.getParameter("action");
			
			if(action.equalsIgnoreCase("Save")) {
				
				try {
					System.out.println("In Save");
					String name = request.getParameter("name");  
					int id = Integer.parseInt(request.getParameter("id"));  
					Date dob = format.parse(request.getParameter("dob"));
					Date doj = format.parse(request.getParameter("doj"));
					String designation = request.getParameter("designation");

					System.out.println(name + " " + id + " " + dob + " " + doj + " " + designation);
					
					EmployeeOperations.insertEmployee(id, name, dob, doj, designation);
					Employee emp = EmployeeOperations.getEmployee(id);
					request.setAttribute("emp", emp);					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/output1.jsp");
					requestDispatcher.forward(request, response);	

				} catch (Exception e) {
					e.printStackTrace();
				} 				
			}
			
			if(action.equalsIgnoreCase("Search")) {
				
				try {
					System.out.println("In Search");

					int id = Integer.parseInt(request.getParameter("id"));  

					Employee emp = EmployeeOperations.getEmployee(id);
	
					request.setAttribute("emp", emp);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/output2.jsp");
					requestDispatcher.forward(request, response);	
				
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}	

		}
	}
