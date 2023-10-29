package sunbasedata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbasedata.dao.DataDao;
import sunbasedata.dto.Data_dto;
;



@WebServlet("/sun")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s=req.getParameter("email");
		String s1=req.getParameter("pwd");
		if(s.equals("test@sunbasedata.com")&&s1.equals("Test@123")) {
			resp.sendRedirect("gcl");
	}
		else {
			resp.getWriter().print("please enter proper credentials");
		}
	}
}



