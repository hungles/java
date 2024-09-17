public class Binario {

    public static void main(String[] args) {
        
 
        int numero = 142;
        String numero_binario = "";
        
        // Mientras el número sea mayor a 0, calculamos el binario
        while (numero > 0) {
            int resto = numero % 2;
            numero = numero / 2;
            
            // Añadimos el resto al principio de la cadena
            numero_binario = resto + numero_binario;

            System.out.println(numero_binario);
        }
        
        // Imprimimos el número binario resultante
        System.out.println("El número binario es: " + numero_binario);
    }



}
