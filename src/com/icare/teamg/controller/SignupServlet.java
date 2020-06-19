package com.icare.teamg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icare.teamg.model.InsertData;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String type = request.getParameter("type");
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String dob = request.getParameter("dob");
	String age = request.getParameter("age");
	String address = request.getParameter("address");
	String phonenumber = request.getParameter("phonenumber");
	String email = request.getParameter("email");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	InsertData flag = new InsertData();
	flag.setData(type, firstname, lastname, dob, age, address, phonenumber, email, name, password);
	if (flag.isFlag()) {
	    out.print("Welcome, " + name);
	    ArrayList<String> temp = new ArrayList<>();
	    temp.add(name);
	    temp.add(password);
	    temp.add(firstname);
	    temp.add(lastname);
	    temp.add(dob);
	    temp.add(age);
	    temp.add(address);
	    temp.add(phonenumber);
	    temp.add(email);
	    temp.add("");
	    temp.add(type);
	    HttpSession session = request.getSession();
	    session.setAttribute("data", temp);
	    session.setAttribute("username", name);
	    session.setAttribute("name", firstname + " " + lastname);
	    if (type.equalsIgnoreCase("doctor")) {
		request.getRequestDispatcher("dhome.jsp").include(request, response);

	    } else {
		request.getRequestDispatcher("phome.jsp").include(request, response);

	    }
	} else {
	    out.print("Sorry, Please validate you form again!");
	    request.getRequestDispatcher("signup.html").include(request, response);
	}
	out.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
    }

}
