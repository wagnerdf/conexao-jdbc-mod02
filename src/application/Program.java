package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection com = DB.getConnection();
		DB.closeConnection();
		

	}

}
