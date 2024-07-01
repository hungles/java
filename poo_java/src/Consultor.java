public class Consultor extends Persona {
    //Atributos
    String rango;
    int id;

    //Constructor
    public Consultor(){
    }

    public Consultor(String rango, int id, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.rango = rango;
        this.id = id;
    }

    //Getters
    public String getRango(){
        return rango;
    }

    public int getId(){
        return id;
    }

    //Setters
    public void setRango(String rango){
        this.rango = rango;
    }

    public void setId(int id){
        this.id = id;
    }

    //Metodos

}
