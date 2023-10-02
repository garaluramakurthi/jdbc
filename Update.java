package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException   {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		PreparedStatement ps=con.prepareStatement("update personal set name=? where id=?");
		ps.setString(1, "gopi");
		ps.setInt(2, 3);
		ps.execute();
		ps.close();
		con.close();
		System.out.println("update sucess");

	}

}
