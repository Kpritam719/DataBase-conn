package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnTest {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:8889/hibernate_crud";
		String user="root";
		String pass = "Pritam@1998";
				
				try {
					
					System.out.println("jdbc url:" + url);
					
					Connection myConn = DriverManager.getConnection(url,user,pass);
					
					System.out.println("Connection successfull");
				}
		catch(Exception e){
			e.printStackTrace();
				}
	}
	
}
