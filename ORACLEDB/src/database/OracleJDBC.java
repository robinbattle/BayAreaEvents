package database;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {

	static Connection connection;

	
	/*
	 * create a database connection
	 */
	public static boolean connectToDB() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return false;

		}

		connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.cs.usfca.edu:1521:xe", "blu2",
					"178538");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return false;

		}

		if (connection == null) {
			return false;
		}

		return true;

	}
	
	/**
	 * search by a specific date
	 * 
	 * @param date a specific date
	 * @param start starting index
	 * @param end ending index
	 * @return ResultSet
	 */
	public static ResultSet searchByDate(String date, int start, int end, String tableName) {

		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT * FROM ("
					+ "SELECT e_id, price, edate, ename, l_id, description, rownum rn "
					+ "FROM " + tableName + " e WHERE rownum < 10000 and e.edate= '"+ date +"'" 
					+ ") WHERE  RN between "+ start +" and "+ end;

			System.out.println(query);

			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

	/**
	 * default event
	 */
	public static ResultSet defaultEvent(int start, int end, String tableName) {

		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT * FROM ("
					+ "SELECT e_id, price, edate, ename, l_id, description, rownum rn "
					+ "FROM " + tableName + " WHERE rownum < 10000"
					+ ") WHERE  RN between "+ start +" and "+ end;

			System.out.println(query);

			rs = stmt.executeQuery(query);

			// while (rs.next()) {
			// System.out.println(rs.getString("ename"));
			// rt = rs.getString("ename");
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
	/**
	 * default free event
	 */
	public static ResultSet defaultFreeEvent(int start, int end, String tableName) {

		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT * FROM ("
					+ "SELECT e_id, l_id, ename, rownum rn "
					+ "FROM " + tableName + " WHERE rownum < 10000"
					+ ") WHERE  RN between "+ start +" and "+ end;

			System.out.println(query);

			rs = stmt.executeQuery(query);

			// while (rs.next()) {
			// System.out.println(rs.getString("ename"));
			// rt = rs.getString("ename");
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
	/**
	 * default free event
	 */
	public static ResultSet defaultPricedEvent(int start, int end, String tableName) {

		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT * FROM ("
					+ "SELECT e_id, l_id, ename, rownum rn "
					+ "FROM " + tableName + " WHERE rownum < 10000"
					+ ") WHERE  RN between "+ start +" and "+ end;

			System.out.println(query);

			rs = stmt.executeQuery(query);

			// while (rs.next()) {
			// System.out.println(rs.getString("ename"));
			// rt = rs.getString("ename");
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
	
	public static ResultSet searchEventByID(String ID, String tableName){
		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT e_id, price, edate, ename, l_id, description "
					+ "FROM "+ tableName +" WHERE E_ID='"+ ID +"'" ;
					

			System.out.println(query);

			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}

	public static ResultSet searchLocationByID(String ID) {
		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "SELECT * FROM Location WHERE L_ID='"+ ID +"'" ;
					

			System.out.println(query);

			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public static Boolean createEvent(String e_id, String name, String date, String l_id, String description, String price){
		if (connection == null)
			return null;

		ResultSet rs = null;
		Statement stmt;
		String query;
		

		
		try {
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			query = "insert into Event(e_id, price, edate, ename, l_id, description) values "
					+ "('"+ e_id +"','" + price + "','" + date + "','" + name + "','" + l_id + "','" + description + "')";
					

			System.out.println(query);

			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			return false;
		}
		return true;
		
	}
	
	

	//
	// public static void main(String[] argv) {
	//
	// System.out.println("-------- Oracle JDBC Connection Testing ------");
	//
	// try {
	//
	// Class.forName("oracle.jdbc.driver.OracleDriver");
	//
	// } catch (ClassNotFoundException e) {
	//
	// System.out.println("Where is your Oracle JDBC Driver?");
	// e.printStackTrace();
	// return;
	//
	// }
	//
	// System.out.println("Oracle JDBC Driver Registered!");
	//
	// Connection connection = null;
	//
	// try {
	//
	// connection = DriverManager.getConnection(
	// "jdbc:oracle:thin:@oracle.cs.usfca.edu:1521:xe", "blu2",
	// "178538");
	//
	// } catch (SQLException e) {
	//
	// System.out.println("Connection Failed! Check output console");
	// e.printStackTrace();
	// return;
	//
	// }
	//
	// if (connection != null) {
	// System.out.println("You made it, take control your database now!");
	// } else {
	// System.out.println("Failed to make connection!");
	// }
	//
	//
	// Statement stmt;
	// try {
	// stmt = connection.createStatement(
	// ResultSet.TYPE_SCROLL_SENSITIVE,
	// ResultSet.CONCUR_UPDATABLE);
	// ResultSet rs =
	// stmt.executeQuery("select * from Event where e_id = 100000001");
	//
	// while (rs.next()) {
	// System.out.println(rs.getString("ename"));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	//
	//
	// }

}