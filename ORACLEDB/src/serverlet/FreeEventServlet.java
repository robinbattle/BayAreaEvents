package serverlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import tool.DateFormatter;
import filters.SearchingFilters;


public class FreeEventServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		PrintWriter out = response.getWriter();

		String start = request.getParameter("start");
		if(start == null){
			start = "1";
		}

		String date = request.getParameter("date");

		String results;

		results = SearchingFilters.defaultFreeEvent(Integer.valueOf(start), Integer.valueOf(start) + 10, "FreeEvent");
	
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("FreeEvent");
		st.setAttribute("results", results);
		
		st.setAttribute("start", String.valueOf(Integer.valueOf(start) + 10));
		st.setAttribute("next", String.valueOf(Integer.valueOf(start) + 20));

		out.println(st.toString());
		
	}
	
	
}
