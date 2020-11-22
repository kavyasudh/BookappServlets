package com.bookstore.model.dao;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucess");

		
	// TODO Auto-generated method stub
		/*
		 * BookDao dao=new BookDaoImpl(); dao.updateBook(2,400);
		 */
	}

}
