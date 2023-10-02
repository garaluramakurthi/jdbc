package jbdcstatement;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;
public class StatementCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		Statement sta=con.createStatement();
		sta.execute("insert into personal values(3,'tej','eee')");
		sta.execute("insert into personal values(2,'ravi','cse')");
		sta.close();
		con.close();
		System.out.println("connection is done");
		
		

	}

}
