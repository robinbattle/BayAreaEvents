package filters;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.OracleJDBC;

public class SearchingFilters {

	public static String searchByDate(String date, int start, int end,
			String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchByDate(date, start, end, tableName);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				sb.append("<li>" + rs.getString("ename") + "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static String defaultEvent(int start, int end, String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = null;
		rs = OracleJDBC.defaultEvent(start, end, tableName);

		StringBuffer sb = new StringBuffer();

		
		try {
			
			while (rs.next()) {
				
				// sb.append("<li>" + rs.getString("ename") + "</li>");
				sb.append("<li>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static String defaultFreeEvent(int start, int end, String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = null;

		rs = OracleJDBC.defaultFreeEvent(start, end, tableName);

		
		
		StringBuffer sb = new StringBuffer();

		try {
			

			while (rs.next()) {
				// sb.append("<li>" + rs.getString("ename") + "</li>");
				sb.append("<li>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();

	}

	public static String defaultPricedEvent(int start, int end, String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = null;

		rs = OracleJDBC.defaultPricedEvent(start, end, tableName);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				// sb.append("<li>" + rs.getString("ename") + "</li>");
				sb.append("<li>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();

	}

	public static String searchByID(String ID, String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchEventByID(ID, tableName);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {

				ResultSet rsLocation = OracleJDBC.searchLocationByID(rs
						.getString("l_id"));
				rsLocation.next();

				sb.append("<li>Name: " + rs.getString("ename") + "</li>");
				sb.append("<li>Price: " + rs.getString("price") + "</li>");
				sb.append("<li>Date: " + rs.getString("edate") + "</li>");
				sb.append("<li>Location: " + rsLocation.getString("lname")
						+ "</li>");
				sb.append("<li>Address: " + rsLocation.getString("address")
						+ "</li>");
				sb.append("<li>Description: " + rs.getString("description")
						+ "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static String searchLocationByID(String ID) {
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchLocationByID(ID);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				sb.append("<li>Name: " + rs.getString("ename") + "</li>");
				sb.append("<li>Price: " + rs.getString("price") + "</li>");
				sb.append("<li>Date: " + rs.getString("edate") + "</li>");
				sb.append("<li>Location: " + rs.getString("l_id") + "</li>");
				sb.append("<li>Description: " + rs.getString("price") + "</li>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

}
