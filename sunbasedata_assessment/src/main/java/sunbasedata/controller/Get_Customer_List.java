package sunbasedata.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import sunbasedata.dao.DataDao;
import sunbasedata.dto.Data_dto;

@WebServlet("/gcl")
public class Get_Customer_List extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DataDao dao = new DataDao();

		List<Data_dto> a = dao.getCustList();
		res.getWriter().print(a);

		req.setAttribute("objects", a);
		RequestDispatcher rd = req.getRequestDispatcher("customerlist.jsp");

		rd.forward(req, res);

		
	}


		
	}
	

