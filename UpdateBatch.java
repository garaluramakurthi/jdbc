package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateBatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		PreparedStatement ps=con.prepareStatement("update personal set branch=? where id=?");
		do {
			
			System.out.println("enter branch");
			String branch=sc.next();
			System.out.println("enter id");
			int id=sc.nextInt();
			ps.setString(1, branch);
			ps.setInt(2,id);
			
			ps.addBatch();
			System.out.println("to update another rec:\n to update enter 1 \to exit enter 0");
			int option=sc.nextInt();
			if(option==0) {
				break;
			}
		}while(true);
			ps.executeBatch();
			System.out.println("sucess");

	}

}
