package Arrays;

public class Listas {

    
    String[] carros = {"Toyota", "Volvo", "Audi"};

    int[] numeros = {1,2,3,45};

    public static void main(String[] args) {
        
        Listas lista1 = new Listas();

        System.out.println(lista1.carros[1]);

        lista1.carros[0] = "Mazda";

        System.out.println(lista1.carros[0]);

        System.out.println(lista1.numeros.length);

    }


}
