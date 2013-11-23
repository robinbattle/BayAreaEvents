package filters;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import database.OracleJDBC;

public class SearchingFilters {

	public static String searchByDate(String date, int start, int end,
			String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchByDate(date, start, end, tableName);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
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
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
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
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
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
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();

	}
	
	
	public static HashMap<String, String> defaultLocation(int size){
		
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.defaultLocation(size);
		
		HashMap<String, String> hm = new HashMap<String, String>();

		try {

			while (rs.next()) {
				
				hm.put(rs.getString("lname"), rs.getString("l_id"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
		
	}
	
	
	
	public static HashMap<String, String> defaultEventNames(int size){
		
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.defaultEventNames(size);
		
		HashMap<String, String> hm = new HashMap<String, String>();

		try {

			while (rs.next()) {
				
				hm.put(rs.getString("ename"), rs.getString("e_id"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
		
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

				sb.append("<tr><td><b>Name: </b></td><td>" + rs.getString("ename") + "</td></tr>");
				sb.append("<tr><td><b>Price: </b></td><td>$" + rs.getString("price") + "</td></tr>");
				sb.append("<tr><td><b>Date: </b></td><td>" + rs.getString("edate") + "</td></tr>");
				sb.append("<tr><td><b>Location: </b></td><td>" + rsLocation.getString("lname")
						+ "</td></tr>");
				sb.append("<tr><td><b>Address: </b></td><td>" + rsLocation.getString("address")
						+ "</td></tr>");
				sb.append("<tr><td><b>Description: </b></td><td>" + rs.getString("description")
						+ "</td></tr>");
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
	
	
	public static String searchEventByLocation(String lname, String tableName){
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchEventByLocation(lname);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
		
	}

	public static String searchByEventName(String name, String tableName) {
		OracleJDBC.connectToDB();
		ResultSet rs = OracleJDBC.searchEventByName(name, tableName);

		StringBuffer sb = new StringBuffer();

		try {

			while (rs.next()) {
				// sb.append("<li>" + rs.getString("ename") + "</li>");
				sb.append("<tr><td>" + "<a href=\"/eventDetails?id="
						+ rs.getString("e_id") + "&tableName=" + tableName
						+ "\">" + rs.getString("ename") + "</a>" + "</td></tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	

}
