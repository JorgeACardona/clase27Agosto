package ces2.entidades;

import java.io.Serializable;


public class Empleado extends Persona implements Pago, Serializable {
    
    public Empleado(String nom){
        super(nom);
    }
    
    double limite = Pago.verificarLimiteAumentoSalario();
    public String aumentarSalario(int porcentaje){ 
        
        return "Aumentando el salario el "+porcentaje+"%. A la "+getNombre();
    }
    
    
}

