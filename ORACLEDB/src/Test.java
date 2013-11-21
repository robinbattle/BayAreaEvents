import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
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

	public static void main(String[] args) {
		connectToDB();
		
		
		String tableName = "event";
		String start = "1";
		String end = "10";
		
		
		ResultSet rs = null;
		Statement stmt;
		String query;
		try {
			stmt = connection.createStatement();

			query = "SELECT e_id, price, edate, ename, l_id, description, rownum rn FROM event WHERE rownum < 10";

			
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

	}

}
