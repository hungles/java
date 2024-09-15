package POO;

public class Perros extends Animales {

    private String nombre;
    private String raza;
    
    public Perros(int numeroPatas, boolean tieneCola, int edad,String nombre, String raza ){
        super(numeroPatas,tieneCola,edad);
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hacerRuido(){
        System.out.println("Guauuu");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
