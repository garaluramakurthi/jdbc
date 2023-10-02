package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		PreparedStatement ps=con.prepareStatement("delete from personal where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		ps.setInt(1, id);
		ps.execute();
		ps.close();
		con.close();
		System.out.println("delete sucess");
		

	}

}
