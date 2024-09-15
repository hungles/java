package POO;

public abstract class Animales {

    private int numeroPatas;
    private boolean tieneCola;
    private int edad;

    public Animales(){}

    public Animales(int numeroPatas, boolean tieneCola, int edad){
        this.numeroPatas = numeroPatas;
        this.tieneCola = tieneCola;
        this.edad = edad;
    }

    public abstract void hacerRuido();
    
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public boolean gettieneCola(){
        return tieneCola;
    }

    public int getedad(){
        return edad;
    }

    public void setnumeroPatas(int numeroPatas){
        this.numeroPatas = numeroPatas;
    }

    public void settieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public void setedad(int edad){
        this.edad = edad;
    }
}
