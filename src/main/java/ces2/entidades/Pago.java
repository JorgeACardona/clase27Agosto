package ces2.entidades;

public interface Pago {
    
    int TOPE_AUMENTO = 20;
    
    default String aumentarSalario(int porcentaje){
        
        return "";
    }
    
    static double verificarLimiteAumentoSalario(){
        return 300000;
    }
    
}
