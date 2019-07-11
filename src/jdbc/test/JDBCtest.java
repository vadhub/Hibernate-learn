package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCtest {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "12345678hbstudent";
		
		System.out.println("Connection to"+ url);
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("Connection!");
	}
	
}
