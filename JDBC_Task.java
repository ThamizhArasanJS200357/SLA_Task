package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Task {
	static final String db_url="jdbc:mysql://localhost:3306/db";
	static final String user="root";
	static final String psw="rolex";
	
	static Connection conn=null;
	public static void main(String[] args) {
		try {
			conn=DriverManager.getConnection(db_url,user,psw);
			Statement stmt=conn.createStatement();
			String sql="select*from Employee limit 3";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("Print the first 3 record");
			while(rs.next()) {
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Firstname :"+rs.getString(2));
				System.out.println("Lastname :"+rs.getString(3));
				System.out.println("Desigination :"+rs.getString(4));
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Firstname Start with S");
			String sql1="select*from employee where firstname like'S%'";
			ResultSet rs1=stmt.executeQuery(sql1);
			while(rs1.next()) {
				System.out.println("ID :"+rs1.getInt(1));
				System.out.println("Firstname :"+rs1.getString(2));
				System.out.println("Lastname :"+rs1.getString(3));
				System.out.println("Desigination :"+rs1.getString(4));
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Lastname End with A");
			String sql2="select*from employee where lastname like'%a'";
			ResultSet rs2=stmt.executeQuery(sql2);
			while(rs2.next()) {
				System.out.println("ID :"+rs2.getInt(1));
				System.out.println("Firstname :"+rs2.getString(2));
				System.out.println("Lastname :"+rs2.getString(3));
				System.out.println("Desigination :"+rs2.getString(4));
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Desigination is manager");
			String sql3="select*from employee where dep='Manager'";
			ResultSet rs3=stmt.executeQuery(sql3);
			while(rs3.next()) {
				System.out.println("ID :"+rs3.getInt(1));
				System.out.println("Firstname :"+rs3.getString(2));
				System.out.println("Lastname :"+rs3.getString(3));
				System.out.println("Desigination :"+rs3.getString(4));
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Duplicated in name");
			String sql4="select*from Employee where lastname IN(select lastname from employee group by lastname having count(*)>1)";
			ResultSet rs4=stmt.executeQuery(sql4);
			while(rs4.next()) {
				System.out.println("ID :"+rs4.getInt(1));
				System.out.println("Firstname :"+rs4.getString(2));
				System.out.println("Lastname :"+rs4.getString(3));
				System.out.println("Desigination :"+rs4.getString(4));
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

}
