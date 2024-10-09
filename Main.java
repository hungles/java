import java.util.Scanner;

import Clases.Usuarios_Premium;

public class Main {

    public static void main(String[] args) {
        

        Usuarios_Premium usuario1 = new Usuarios_Premium("Carlos", "Perez", 31, "cperes@hotmail.com", 130, "MAX", true);

        System.out.println(usuario1.getApellido());
        
        Scanner input = new Scanner(System.in);

        int n = 0;
        int resultado = 0;
        while (resultado != 5) {

            if (n == 0 || n == 1){
                System.out.println("Seleccione 1 para realizar la acciones1, 2 para realzar la acciones2, 3 para realizar la acciones3");

                resultado = input.nextInt();
            }
            
            switch (resultado) {
                case 1:
                    usuario1.acciones1();
                    n = 1;
                    break;
                case 2:
                    usuario1.acciones2();
                    n = 1;
                    break;
                case 3:
                    usuario1.acciones3();
                    n = 1;
                    break;
                default:
                    System.out.println("Inserte un valor valido, para salir del programa ingrese 5");
                    resultado = input.nextInt();
                    n = 2;
                    if ( resultado == 5 ) {
                        break;
                    }  
            }

            input.close();
        }


    }



}