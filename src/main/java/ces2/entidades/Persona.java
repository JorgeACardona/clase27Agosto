package ces2.entidades;

public class Persona {
    private String nombre;
    
    public Persona(String nom){
        this.nombre = nom;
    }
    
    public String getNombre(){
        return "persona con nombre: "+nombre+".";
    }
}
