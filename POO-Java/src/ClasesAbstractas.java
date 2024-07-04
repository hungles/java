public class ClasesAbstractas {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(4);

        System.out.println("El area del cuadrado es " + c1.calcularArea() + " " + c1.dibujable());
    
        
        Circulo c2 = new Circulo(3);

        System.out.println("El area del circulo es " + c2.calcularArea() + " " + c2.dibujable() + " y " + c2.rotable());
    
        
    }
}
