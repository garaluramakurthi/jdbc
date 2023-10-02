package jbdcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.StatementWrapper;


public class UpdateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		Statement sta=con.createStatement();
		sta.execute("update personal set name='dan' where id=1");
		sta.close();
		con.close();
		System.out.println("update sucess");
		

	}

}
