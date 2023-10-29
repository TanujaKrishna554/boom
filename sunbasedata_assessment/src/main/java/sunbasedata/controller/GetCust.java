package sunbasedata.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import sunbasedata.dao.DataDao;

public class GetCust extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("uuid");
		
		int cid = Integer.parseInt(id);
		DataDao dao = new DataDao();
		Object msg = dao.getCust(cid);
		res.getWriter().print(msg);

	}

}



