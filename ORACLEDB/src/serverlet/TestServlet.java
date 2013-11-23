package serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import filters.SearchingFilters;

public class TestServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();

		
		StringBuffer results = new StringBuffer();

		String start = request.getParameter("start");
		
		String size = request.getParameter("size");
		
		String next = request.getParameter("next");
		

		if(start == null){
			start = "0";
		}
	
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("test");
		
		st.setAttribute("start", String.valueOf(Integer.valueOf(start) + 10));
		st.setAttribute("next", String.valueOf(Integer.valueOf(start) + 20));
		
		

		
		
		out.println(st.toString());
		
	}

}
