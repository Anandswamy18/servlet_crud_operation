package servlet_crud10.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud10.dao.Dao;
import servlet_crud10.dto.Dto;

@WebServlet("/delete")
public class DeleteById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		String id = req.getParameter("id");
		int cid = Integer.parseInt(id);

		Dao d2 = new Dao();
		String msg = d2.delete(cid);
//		 resp.getWriter().print(msg);

		List<Dto> list = (List<Dto>) d2.fetchAll();
		req.setAttribute("objects", list);

		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);

	}
}
