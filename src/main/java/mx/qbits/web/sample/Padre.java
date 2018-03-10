package mx.qbits.web.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Padre extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException {
        // Do required initialization
    }

    protected abstract String getCadena();
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + getCadena() + "</h1>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    
    public void destroy() {
        // do nothing.
    }
}











/** /

package mx.qbits.web.sample;

public class PbaServlet extends Padre { 
  private static final long serialVersionUID = 1L;

  protected String getMessage() { 
    return "Hola Goose"; 
  }
}

/**/
