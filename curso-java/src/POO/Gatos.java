package POO;

public class Gatos extends Animales {

    private String nombre;
    private String raza;
    
    public Gatos(int numeroPatas, boolean tieneCola, int edad,String nombre, String raza ){
        super(numeroPatas,tieneCola,edad);
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hacerRuido(){
        System.out.println("Miauuu");
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
