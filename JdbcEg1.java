package Prgs10226;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEg1 {

	private static final String userName = "root";
	private static final String password = "Ragul@123"; 
	private static final String connectionUrl = "jdbc:mysql://127.0.0.1:3306?user=root";
	//dml
	static void dataManipulation(Connection establishConn , Statement stmt) throws SQLException {

		/*int noOfRowsInserted = stmt.executeUpdate("INSERT INTO kholapurdb.carowner VALUES('dummy' , 'dummy1')");
		if(noOfRowsInserted > 0)
			System.out.println(noOfRowsInserted +" inserted successfully");
		else  System.out.println(noOfRowsInserted +"not inserted successfully");*/
		/*int noOfRowsUpdated= stmt.executeUpdate("UPDATE kholapurdb.carowner SET name = 'updated'") ;
		if(noOfRowsUpdated > 0)
			System.out.println(noOfRowsUpdated +" updated successfully");
		else  System.out.println(noOfRowsUpdated +"not updated successfully");*/
		
		int noOfRowsDeleted= stmt.executeUpdate("DELETE FROM kholapurdb.carowner") ;
		if(noOfRowsDeleted > 0)
			System.out.println(noOfRowsDeleted +" deleted successfully");
		else  System.out.println(noOfRowsDeleted +"not updated successfully");
	}
	

	public static void main(String[] args) { //throws ClassNotFoundException, SQLException
		Connection establishConn = null;  //life at the time of method call
		try {
			Class.forName("com.mysql.jdbc.Driver");
			establishConn = DriverManager.getConnection(connectionUrl, userName, password);
			Statement stmt = establishConn.createStatement();
			dataManipulation(establishConn, stmt);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				establishConn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}


