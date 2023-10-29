package sunbasedata.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbasedata.dao.DataDao;
import sunbasedata.dto.Data_dto;

@WebServlet("/cd")
public class Datacontroller extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String uuid=req.getParameter("uuid");
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String street=req.getParameter("street");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String emailid=req.getParameter("emailid");
		String phone=req.getParameter("phone");
		
	
	
		Data_dto d=new Data_dto();
		d.setFirst_name(firstname);
		d.setLast_name(lastname);
		d.setAddress(address);
		d.setState(state);
		d.setCity(city);
		d.setStreet(street);
		d.setEmail(emailid);
		int cid=Integer.parseInt(uuid);
		d.setUuid(cid);
		
		
		long pid=Long.parseLong(phone);
		
		d.setPhone(pid);
		
		System.out.println(d);
		
		
		
		DataDao d2=new DataDao();
		d2.insert(d);
		resp.getWriter().print("201,successfuly created");
		
		
		
		
		
		
		
	}

}



