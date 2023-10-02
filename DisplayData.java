package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","tiger");
		PreparedStatement ps=con.prepareStatement("select * from advance.personal");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			
		}
		
		ps.execute();
		ps.close();
		con.close();
		System.out.println("sucess");
		

	}

}
