public class Persona {
    
    private String nombre;
    private int edad;
    private String estado;

    public Persona(){

    }

    public Persona(String nombre, int edad, String estado){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getEstado(){
        return estado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
}
