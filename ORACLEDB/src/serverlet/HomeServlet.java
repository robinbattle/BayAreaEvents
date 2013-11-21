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

public class HomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		
//		String startIndex = null;
//
//		Cookie[] cookies = request.getCookies();
//		if (cookies != null) {
//			for (Cookie cookie : cookies) {
//				if (cookie.getName().equals("startIndex")) {
//					startIndex = cookie.getValue();
//					System.out.println("yes");
//				}
//
//			}
//		}
//		if (startIndex == null) {
//			Cookie cookie = new Cookie("startIndex", "0");
//			response.addCookie(cookie);
//		}
		
		
		PrintWriter out = response.getWriter();



		
	
	
		StringTemplateGroup templates = new StringTemplateGroup("mygroup",
				"templates");
		StringTemplate st = templates.getInstanceOf("home");

		//st.setAttribute("results", "<img src=\"img/sanfran.png\"></img>");

		out.println(st.toString());

		//
		// out.println("<html><title>HOME</title><body>Goodbye, " + result
		// + "!<br/>Come again soon</body></html>");
		//

	}



}
