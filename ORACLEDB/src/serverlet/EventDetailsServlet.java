package serverlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import database.OracleJDBC;
import tool.DateFormatter;
import filters.SearchingFilters;

public class EventDetailsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		PrintWriter out = response.getWriter();


		String ID = request.getParameter("id");
		String tableName = request.getParameter("tableName");
		tableName = "Event"; /* need discuss later */

		String results;
		results = SearchingFilters.searchByID(ID, tableName);
		
		
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("EventDetails");
		st.setAttribute("results", results);

		out.println(st.toString());
		
	}
	

	
	
}
