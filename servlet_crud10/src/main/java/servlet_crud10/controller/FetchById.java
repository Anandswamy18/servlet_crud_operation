package servlet_crud10.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud10.dao.Dao;

@WebServlet("/fetchbyid")
public class FetchById  extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		
		  String id=req.getParameter("id");
		    int cid=Integer.parseInt(id);
		    
		    Dao d1=new Dao();
		  Object o= d1.fetchById(cid);
		  resp.getWriter().print(o);
		    
	}

}
