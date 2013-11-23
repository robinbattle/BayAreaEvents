package serverlet;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.servlet.ServletHandler;


public class MyServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		Server server = new Server();
        Connector connector=new SocketConnector();
        connector.setPort(8080);
        server.setConnectors(new Connector[]{connector});

        ServletHandler handler=new ServletHandler();
        server.setHandler(handler);

        
        handler.addServletWithMapping("serverlet.HomeServlet", "/");
        handler.addServletWithMapping("serverlet.AllEventServlet", "/all");
        handler.addServletWithMapping("serverlet.PricedEventServlet", "/priced");
        handler.addServletWithMapping("serverlet.FreeEventServlet", "/free");
        handler.addServletWithMapping("serverlet.LocationSearchServlet", "/locationSearch");
        handler.addServletWithMapping("serverlet.EventSearchServlet", "/eventSearch");
        handler.addServletWithMapping("serverlet.EventDetailsServlet", "/eventDetails");
        handler.addServletWithMapping("serverlet.CreateEventServlet", "/createEvent");
        
        handler.addServletWithMapping("serverlet.TestServlet", "/test");
        
        

        server.start();
        server.join();

	}

}
