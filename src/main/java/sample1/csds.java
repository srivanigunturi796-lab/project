package sample1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/csds")
public class csds extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    public csds() {
        super();
    }
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialization");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service Phase");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}