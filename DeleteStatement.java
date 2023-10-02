package jbdcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		Statement statement=con.createStatement();
		statement.execute("delete from personal where id=3");
		statement.close();
		con.close();
		System.out.println("delete sucessful");
		
		
		

	}

}
