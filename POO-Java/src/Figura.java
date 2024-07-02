public abstract class Figura {
    
    protected double x; //Posicion en x
    protected double y; //Posicion en y

    //Constructores de la clase abstractas(Las clases abstractas no pueden ser instanciadas)
    protected Figura(){
    }

    protected Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Metodo abstracto para definir la clase abstracta
    public abstract double calcularArea();

}
