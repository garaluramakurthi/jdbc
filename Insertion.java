package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		PreparedStatement ps=con.prepareStatement("insert into personal values(?,?,?)");
		ps.setInt(1, 3);
		ps.setString(2, "gopi");
		ps.setString(3,"bsc" );
		ps.execute();
		ps.close();
		con.close();
		System.out.println("insertion sucess");
		
		
		

	}

}
