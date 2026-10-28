package csd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/csds1")
public class csds1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public csds1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter obj=response.getWriter();
		response.setContentType("text/html");
		obj.println("<table>");
		obj.println("<tr>"+"<td>"+"Sno"+"</td>"+"<tr>"+"<td>"+"Name"+"</td>"+"</tr>");
		obj.println("<tr>"+"<td>"+"1"+"</td>"+"<tr>"+"<td>"+"hello"+"</td>"+"</tr>");
		obj.println("</table>");
	}
}