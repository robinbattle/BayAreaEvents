package serverlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import tool.DateFormatter;
import filters.SearchingFilters;

public class LocationSearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();

		String locationName = request.getParameter("locationName");

		String results = "";
		String examples = "";

		if(locationName != null){
			results = SearchingFilters.searchEventByLocation(locationName, "Event");
		}
		
		//Lauren Coaching Center
		
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("LocationSearch");
		st.setAttribute("results", results);
		
		st.setAttribute("examples", locationExamples());

		out.println(st.toString());
		
	}
	
	String locationExamples(){
		StringBuffer sb = new StringBuffer();
		HashMap<String, String> hm = SearchingFilters.defaultLocation(10);
		for(String s : hm.keySet()){
			sb.append("<option value=\"" + s + " \">" + s + "</option>");
		}
		
		
		return sb.toString();
		
	}
	
	
	
}
