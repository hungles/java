import java.util.Scanner;

public class Estructura_switch {
    public static void main(String[] args) throws Exception{
        
        //Que tipo de bebida te gusta

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elije una opcion de las siguientes: ");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");

        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Que buena eleccion, de paso combina con una galleta");
                break;
            case 2:
                System.out.println("Debes ser argentino");
                break;
            case 3:
                System.out.println("Ten cuidado con el azucar!!, es mala para la salud");
                break;
            case 4:
                System.out.println("No manejes por favor");
                break;
            default:
                System.out.println("Buena eleccion");
                break;
        }

        scanner.close();
        
    }
}