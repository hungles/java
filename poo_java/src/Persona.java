public class Persona {

    //Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //Constructores

    //Constructor Vacio
    public Persona(){
    }

    //Constructor que recibe argumentos
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Metodos(comportamientos de un objeto)

    public String NombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        return " Te saluda " + saludado;

    }
}
