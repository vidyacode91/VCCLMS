package database;

import java.sql.*;

public class LibrarianLoginDao{
	public static boolean validate(String username, String password) {
		boolean status=false;
		try {
			//Loading drivers for mysql
			Class.forName("com.mysql.jdbc.Driver");
			
			//Creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcc","root","");
			PreparedStatement ps = con.prepareStatement("select * from librarianlogin where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
		}
		return status;
	}

}
