package jdbccallable;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class DeleteUsingStored {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		CallableStatement cb=(CallableStatement) con.prepareCall("call remove(?)");
		System.out.println("enter id");
		int id=sc.nextInt();
		cb.setInt(1, id);
		cb.execute();
		System.out.println("delete sucess");
		
	}

}
