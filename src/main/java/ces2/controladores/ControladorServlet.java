package ces2.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.Stateful;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Stateful(passivationCapable=false)
public class ControladorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String nombre = request.getParameter("UserName");
            String tipo = request.getParameter("tipos");
            
            if(nombre != null && !nombre.isEmpty() && 
                    tipo != null && !tipo.isEmpty()){
                
            } else {
                out.println("Se debe ingresar el nombre y el tipo");
            }
        }
    }

   

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    

}
