package com.vg.hibernate.starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/one-to-one-1?useUnicode=true&useJDBCCompliantTimezoneShift=true&auseLegacyDatetimeCode=false&serverTimezone=UTC";
		String name = "hbstudent";
		String password = "12345678hbstudent";
		
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
