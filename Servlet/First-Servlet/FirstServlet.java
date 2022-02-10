import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.*;

public class FirstServlet extends HttpServlet {
 public void service( HttpServletRequest request, 
HttpServletResponse response ) 
 throws ServletException, IOException { 
response.setContentType( "text/html" ); 
PrintWriter out = response.getWriter(); 
out.println( "<html><body>" ); 
out.println( "<h1>Bonjour Tony Dfouny</h1>" ); 
out.println( "</body></html>" ); 
 } 
}