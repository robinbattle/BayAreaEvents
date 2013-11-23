package serverlet;

import database.OracleJDBC;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import tool.DateFormatter;
import filters.SearchingFilters;

public class AllEventServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		// String startIndex = null;
		//
		// Cookie[] cookies = request.getCookies();
		// if (cookies != null) {
		// for (Cookie cookie : cookies) {
		// if (cookie.getName().equals("startIndex")) {
		// startIndex = cookie.getValue();
		// System.out.println("yes");
		// }
		//
		// }
		// }
		// if (startIndex == null) {
		// Cookie cookie = new Cookie("startIndex", "0");
		// response.addCookie(cookie);
		// }

		PrintWriter out = response.getWriter();

		String date = request.getParameter("date");

		String results;
		
		String start = request.getParameter("start");
		if(start == null){
			start = "1";
		}

		if (date != null) {
			date = new DateFormatter(date).format();
		}

		if (date == null) {
			results = SearchingFilters.defaultEvent(Integer.valueOf(start), Integer.valueOf(start) + 10, "Event");
		} else {
			results = SearchingFilters.searchByDate(date, Integer.valueOf(start), Integer.valueOf(start) + 10, "Event");
		}
		
		

		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("AllEvent");
		st.setAttribute("results", results);
		
		st.setAttribute("start", String.valueOf(Integer.valueOf(start) + 10));
		st.setAttribute("next", String.valueOf(Integer.valueOf(start) + 20));
		
		if (date != null) {
			st.setAttribute("date", "<input type=\"hidden\" name=\"date\" id=\"datepicker\" value=\"" + date + "\"/>");
			st.setAttribute("dateValue", "value=\"" + date + "\"");
		}
		

		out.println(st.toString());

		//
		// out.println("<html><title>HOME</title><body>Goodbye, " + result
		// + "!<br/>Come again soon</body></html>");
		//

	}

}
