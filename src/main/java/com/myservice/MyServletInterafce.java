package com.myservice;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServletInterafce implements Servlet{

	ServletConfig config;
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet Version 1.0";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is initiated");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1>This is Servlet Interface</h1>");
		out.println("</body></html>");
	}
}



