package ces2.controladores;

import ces2.entidades.Contratista;
import ces2.entidades.Empleado;
import ces2.entidades.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Stateful(passivationCapable=false)
public class ControladorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            HttpSession sesion=request.getSession(true);
  
            List<Persona> trabajadores;
            
            trabajadores = (List<Persona>) sesion.getAttribute("trabajadores");
            
            String nombre = request.getParameter("UserName");
            String tipo = request.getParameter("tipos");
            
            if(nombre != null && !nombre.isEmpty() && 
                    tipo != null && !tipo.isEmpty()){
                
            Empleado emp;
            Contratista contr;
                
            if(tipo.equals("empleado")){
                
                emp = new Empleado(nombre);
                
                if(trabajadores == null){
                    trabajadores = new ArrayList<>();
                    trabajadores.add(emp);
                    sesion.setAttribute("trabajadores", trabajadores);
                } else {
                    
                    trabajadores.add(emp);
                }
                
                
            }else if (tipo.equals("contratista")){
                 
                
                contr = new Contratista(nombre);
                
                if(trabajadores == null){
                    trabajadores = new ArrayList<>();
                    trabajadores.add(contr);
                    sesion.setAttribute("trabajadores", trabajadores);
                } else {
                    
                    trabajadores.add(contr);
                }
            }
            
            request.setAttribute("trabajadores",trabajadores);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            
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
