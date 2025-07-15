package JDBC;

import java.sql.CallableStatement;
//import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_CallableStatement {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String user="root";
	static final String pass="rolex";
	
	static Connection conn=null;
	public static void main(String[] args) {
		try {
			conn=DriverManager.getConnection(DB_URL,user,pass);
			CallableStatement stmt=conn.prepareCall("{call db.Insert12(?,?,?,?,?)}");
			stmt.setInt(1,9);
			stmt.setString(2,"KS");
			stmt.setString(3,"RaviKumar");
			stmt.setString(4,"Haviss 3D");
			stmt.setInt(5,50);
			stmt.executeQuery();
			System.out.println("Row Inserted");
			
			Statement stmt1=conn.createStatement();
			String sql="select*from employee";
			ResultSet rs=stmt1.executeQuery(sql);
			while(rs.next()) {
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Firstname :"+rs.getString(2));
				System.out.println("Lastname :"+rs.getString(3));
				System.out.println("Lastname :"+rs.getString(4));
				System.out.println("Lastname :"+rs.getInt(5));
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
	}
}
