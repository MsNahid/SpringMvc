package com.nahidsohel.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "TestDbServlet", value = "/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/hibernate_db";
		String user = "postgres";
		String password = "postgres";
		String driver = "org.postgresql.Driver";
		
		// get connection to database
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Conection to database: " + jdbcUrl);
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			out.println("DataBase Connected!!");
			
			myConn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			throw new ServletException(e);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
