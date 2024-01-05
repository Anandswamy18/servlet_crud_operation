package servlet_crud10.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud10.dao.Dao;
import servlet_crud10.dto.Dto;
@WebServlet("/insert")
public class Insert extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String mail=req.getParameter("email");
		
		String phno=req.getParameter("phno");
		long phone=Long.parseLong(phno);
		
		String gender=req.getParameter("gender");
		String country=req.getParameter("select");
		String check=req.getParameter("checkbox");
		
		
		Dto d1=new Dto();
		d1.setId(cid);
		d1.setName(name);
		d1.setEmail(mail);
		d1.setDob(dob);
		d1.setPhone(phone);
		d1.setCheckbox(check);
		d1.setGender(gender);
		d1.setCountry(country);
		
		
		Dao d2=new Dao();
		 d2.insert(d1);
		
	}

}
