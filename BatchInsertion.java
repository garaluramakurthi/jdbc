package jdbcprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchInsertion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","tiger");
		PreparedStatement ps=con.prepareStatement("insert into personal values(?,?,?)");
		do {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter branch");
			String branch=sc.next();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, branch);
			
			ps.addBatch();
			System.out.println("to insert another rec:\n to insert enter 1 \to exit enter 0");
			int option=sc.nextInt();
			if(option==0) {
				break;
			}
		}while(true);
			ps.executeBatch();
			System.out.println("sucess");
		}
	

}

