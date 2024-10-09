package Clases;
public class Usuarios {

    private String nombre;
    private String apellido;
    private int edad;
    private String correo;


    public Usuarios(String nombre, String apellido, int edad, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    //Getters
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getCorreo(){
        return correo;
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

    public void setCorreo(String correo){
        this.correo = correo;
    }
}