package com.ethan.java;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DellhotdealsServlet extends HttpServlet {
	
	private static final Logger log = 
			Logger.getLogger(DellhotdealsServlet.class.getName());
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
