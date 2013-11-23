package serverlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import tool.DateFormatter;
import database.OracleJDBC;
import filters.SearchingFilters;


public class CreateEventServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		PrintWriter out = response.getWriter();

		HashMap<String, String> hm = SearchingFilters.defaultLocation(25);
		StringBuffer results = new StringBuffer();
		
		for(String s : hm.keySet()){
			results.append("<option value=\"" + hm.get(s) + "\">" + s + "</option>");
		}
		
	
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("CreateEvent");
		st.setAttribute("results", results);
		out.println(st.toString());
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String price = request.getParameter("price");
		String l_id = request.getParameter("l_id");
		String description = request.getParameter("description");
		
		
		boolean b = OracleJDBC.createEvent(name, date, l_id, description, price);
		
		PrintWriter out = response.getWriter();
		if(b){
			out.println("yes");
		}else{
			out.println("no");
		}
		
	}
	
	
}
