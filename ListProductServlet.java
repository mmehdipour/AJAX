package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
	//	response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	System.out.println("list product servlet");
	String content = "[{\"product_name\":"+"\"Mac\",\"price\":1000},"
			+"{\"product_name\":\"Lenova\",\"price\":1000)}]";
	PrintWriter out = response.getWriter();
	out.write(content);
	out.flush();
	

	
	}
	private void setAccessControlHeaders(HttpServletResponse resp) {
        //resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET");
    }

}
