public class Circulo implements Figura, Dibujar, Rotar{
    
    double radio;

    public Circulo(){

    }
    
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double pi = 3.14;
        double resultado = (radio * radio) * pi;
        return resultado;
    }

    public String dibujable(){
        return "Es dibujable";
    }

    public String rotable(){
        return "Es rotable";
    }
}
