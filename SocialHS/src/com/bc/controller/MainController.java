package com.bc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		String path = null;
		
//		Command comm = null;
		
//		if(type.equals("list")) {
//			comm = new ListCommand();
//		}else if(type.equals("one")) {
//			comm = new OneCommand();
//		}else if(type.equals("write")) {
//			comm = new WriteCommand();
//		}else if(type.equals("write_ok")) {
//			comm = new Write_okCommand();
//		}else if(type.equals("update")) {
//			comm = new UpdateCommand();
//		}else if(type.equals("update_ok")) {
//			comm = new Update_okCommand();
//		}else if(type.equals("delete")) {
//			comm = new DeleteCommand();
//		}else if(type.equals("delete_ok")) {
//			comm = new Delete_okCommand();
//		}
//		path = comm.exec(request, response);
//		request.getRequestDispatcher(path).forward(request, response);
		
		
	}

}
