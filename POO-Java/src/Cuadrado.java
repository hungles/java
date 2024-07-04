public class Cuadrado implements Figura, Dibujar{
    
    private double lado;

    public Cuadrado(){

    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    //Sobreescritura de metodo
    @Override
    public double calcularArea(){
        double resultado = lado * lado;
        return resultado;
    }

    public String dibujable(){
        return "Es dibujable";
    }
}
