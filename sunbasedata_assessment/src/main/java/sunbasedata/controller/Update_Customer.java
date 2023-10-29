package sunbasedata.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbasedata.dao.DataDao;
import sunbasedata.dto.Data_dto;
@WebServlet("/updatecust")
public class Update_Customer extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String street=req.getParameter("street");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String emailid=req.getParameter("emailid");
		String phone=req.getParameter("phone");

		String uuid=req.getParameter("uuid");
		
	Data_dto d=new Data_dto();
	d.setFirst_name(firstname);
	d.setLast_name(lastname);
	d.setStreet(street);
	d.setAddress(address);
	d.setCity(city);
	d.setEmail(emailid);
	long cid=Long.parseLong(phone);
	d.setPhone(cid);
	int pid=Integer.parseInt(uuid);
	d.setUuid(pid);
	
	DataDao d1=new DataDao();
	d1.updateCustomer(d);
	
		
		
	}

}
