/*
 * package com.bookstore.web.controller;
 * 
 * import java.io.IOException;
 * 
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import com.bookstore.model.dao.*;
 *//**
	 * Servlet implementation class BookContoller
	 */
/*
 * @WebServlet("/BookController") public class BookController extends
 * HttpServlet { private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public BookController() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String
 * action=request.getParameter("action");
 * if(action.contentEquals("showallbooks")) { RequestDispatcher
 * rd=request.getRequestDispatcher("show.jsp"); rd.forward(request, response);
 * 
 * }else if(action.equals("addbook")) {
 * request.getRequestDispatcher("addbook.jsp").forward(request, response);
 * 
 * }
 * 
 * }
 *//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
/*
 * else if(action.equals("delBook")) { int
 * id=Integer.parseInt(request.getParameter("id").trim()); }
 * 
 * 
 * dao.delBook(id); response.sendRedirect("BookController?action=showallbooks");
 * 
 * }else if(action.equals("updateBook")) { int
 * id=Integer.parseInt(request.getParameter("id").trim()); Book
 * book=dao.getBookById(id);
 * response.sendRedirect("BookController?action=showallbooks");
 * 
 * 
 */
