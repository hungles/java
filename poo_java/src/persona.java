public class persona {

    //Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;
    
    //Metodos(comportamientos de un objeto)

    public String NombreCompleto(){
        return nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        return " Te saluda " + saludado;

    }
}
