package com.Register;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	
	private static String dbUrl = "jdbc:mysql://localhost:3306/userdb";
	private static String dbUname = "root";
	private static String dbPassword = "";
	private static String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public static void loadDriver(String dbDriver) 
	{
		try {
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
			
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void insert(Member member) {
		loadDriver(dbDriver);
		Connection con = getConnection();
//		String result = "Data entered successfully";
		String sql = "INSERT INTO users" + "  (uname,password, email, address,phone) VALUES "
		+ " (?, ?, ?,?,?);";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getPhone());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
//			result = "Data not Entered";
		}
//		return result;
	}
}
