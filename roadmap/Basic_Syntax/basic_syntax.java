import java.util.Scanner;

public class basic_syntax {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo como estan");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserte su nombre: ");

        String nombre = input.nextLine();

        System.out.println("Inserte su edad: ");

        int edad = input.nextInt();

        System.out.println("Mi nombre es " + nombre + " y mi edad es " + edad);


    }

}
