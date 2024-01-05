package servlet_crud10.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud10.dao.Dao;
import servlet_crud10.dto.Dto;

@WebServlet("/update")
public class Update extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		String id = req.getParameter("newid");
		int cid = Integer.parseInt(id);
		String phone = req.getParameter("phone");
		long ph1 = Long.parseLong(phone);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String checkbox=req.getParameter("checkbox");
		String country=req.getParameter("country");

		Dto d1 = new Dto();
		d1.setId(cid);
		d1.setPhone(ph1);
		d1.setCheckbox(checkbox);
		d1.setCountry(country);
		d1.setDob(dob);
		d1.setEmail(email);
		d1.setGender(gender);
		d1.setName(name);
		

		Dao d2 = new Dao();
		d2.update(d1);

	}

}
