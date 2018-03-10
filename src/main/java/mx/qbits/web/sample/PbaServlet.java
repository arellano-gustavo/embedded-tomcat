package mx.qbits.web.sample;

import javax.servlet.annotation.WebServlet;

@WebServlet(
        name = "PbaServlet",
        urlPatterns = {"/dos"}
    )
public class PbaServlet extends Padre {
    private static final long serialVersionUID = 1L;

    @Override
    protected String getCadena() {
        return "Hola Gustavo";
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
