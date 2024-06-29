import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) throws Exception {
        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        //Palabra a buscar
        String palabraBuscada = "inteligencia";
        //Intentos maximos para el usuario
        int intentosMaximos = 5;
        //Contador de intentos, inicializado en 0
        int intentos = 0;
        //Empezamos indicando que no se encontro la palabra buscada
        boolean seEncontroLaPalabra = false;
        // Array con una longitud de la cantidad de caracteres de la palabra buscada
        char[] caracteresIngresados = new char[palabraBuscada.length()];
        //Bucle para agregar el valor "_" a cada valor del indice del array
        for (int i = 0; i < caracteresIngresados.length; i++) {
            caracteresIngresados[i] = '_';
        }
        //Inicia el Juego
        System.out.println("El juego del ahorcardo, encuentra la siguiente palabra: " + String.valueOf(caracteresIngresados) + " " + caracteresIngresados.length + " caracteres");
        //Este bucle finalizara hasta que se halla encontrado la palabra buscada o se alcance el maximo de intentos
        while(!seEncontroLaPalabra && intentos < intentosMaximos){
            //Cada intento empezara con false, sino cambia su estado se añadira un punto al contador de intentos
            boolean verificarIntento = false;
            //Prompt para solicitarle al usuario que ingrese una letra
            System.out.println("Ingrese una letra: ");
            //La clase scanner obtendra la primera letra escrita por el usuario y la guardara en una variable letra
            char letra =scanner.next().charAt(0);
            //Iterar sobre cada letra de la palabra buscada y si hay coincidencia con la letra ingresada por el usuario
            for (int i = 0; i < caracteresIngresados.length; i++) {
                // Verificar si hay coincidencia
                if(palabraBuscada.charAt(i) == letra ){
                    // Remplazar el mismo indice que la palabra buscada por la letra ingresada
                    caracteresIngresados[i] = letra;
                    // Cambiar el estado de intento para no aumentar el contador de intentos
                    verificarIntento = true;
                }

                if(i == caracteresIngresados.length -1 && verificarIntento == true){
                    System.out.println("Bien Jugado has encontrado la letra " + letra + " para la palabra: " + String.valueOf(caracteresIngresados));
                }
            }
            //Verificar si la letra no es coincidente con la palabra buscada
            if (verificarIntento == false){
                //Se aumenta a 1 el contador de intento
                intentos++;
                System.out.println("Letra Incorrecta, te quedan: " + (intentosMaximos - intentos)+ " intentos " + " :" + String.valueOf(caracteresIngresados));
            }
            // Si la palabra buscada coincide con el array de letras ingresadas por el usuario entonces indicar que se encontro la palabra
            if (palabraBuscada == String.valueOf(caracteresIngresados)){
                seEncontroLaPalabra = true;
                System.out.println("¡Felicidades! encontro la palabra buscada");
            }
            
        }
        System.out.println("Lo sentimos Haz perdido :(");
        scanner.close();
    }
}
