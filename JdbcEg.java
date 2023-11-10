package Prgs10226;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcEg {

	private static final String userName = "root";
	private static final String password = "Ragul@123"; 
	private static final String connectionUrl = "jdbc:mysql://127.0.0.1:3306?user=root";

	public static void main(String[] args) { //throws ClassNotFoundException, SQLException
		Connection establishConn = null;  //life at the time of method call
		try {
			Class.forName("com.mysql.jdbc.Driver");
			establishConn = DriverManager.getConnection(connectionUrl, userName, password);
			Statement stmt = establishConn.createStatement();
			ResultSet resultsFromDb = stmt.executeQuery("SELECT * FROM kholapurdb.carowner");
			for(; resultsFromDb.next();) {
				System.out.println(resultsFromDb.getString(1)+" "+resultsFromDb.getString(2));
				System.out.println(resultsFromDb.getString("carNum")+" "+resultsFromDb.getString("name"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				establishConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//automatically it ll be dead
	}

}
