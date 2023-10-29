package sunbasedata.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbasedata.dao.DataDao;
import sunbasedata.dto.Data_dto;


@WebServlet("/dc")
public class DeleteCustomer extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	String id = req.getParameter("uuid");
//	System.out.println("controller" + id);
	int cid = Integer.parseInt(id);
	DataDao dao = new DataDao();
	dao.deleteCustomer(cid);
	List<Data_dto> a = dao.getCustList();
	req.setAttribute("objects",a);
//	res.getWriter().print(a);
	RequestDispatcher rd = req.getRequestDispatcher("customerlist.jsp");
//	resp.getWriter().println(a);
	rd.forward(req, resp);
	
	
}
}
