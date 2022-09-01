package ces2.entidades;

import java.io.Serializable;


public class Empleado implements Pago, Serializable {
    
    double limite = Pago.verificarLimiteAumentoSalario();
    public String aumentarSalario(int porcentaje){ 
        return "";
    }
    
    
}

