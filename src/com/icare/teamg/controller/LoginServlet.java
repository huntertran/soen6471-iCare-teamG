package com.icare.teamg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icare.teamg.model.RetrieveData;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	RetrieveData retrieveData = new RetrieveData();
	HashMap<String, ArrayList<String>> data = retrieveData.getData(type);
	if (data.containsKey(name)) {
	    ArrayList<String> temp = data.get(name);
	    if (temp.get(1).equals(password)) {
		HttpSession session = request.getSession();
		session.setAttribute("data", temp);
		session.setAttribute("username", name);
		session.setAttribute("name", temp.get(2) + " " + temp.get(3));
		if (type.equalsIgnoreCase("doctor")) {
		    request.getRequestDispatcher("dhome.jsp").include(request, response);
		} else {
		    request.getRequestDispatcher("phome.jsp").include(request, response);
		}
	    } else {
		out.print("Sorry, password error!");
		request.getRequestDispatcher("index.html").include(request, response);
	    }
	} else {
	    out.print("Sorry, username or password error!");
	    request.getRequestDispatcher("index.html").include(request, response);
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
