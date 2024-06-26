public class bucle_for {
    public static void main(String[] args) throws Exception {
        // Declarar las variables fuera de los bloques `for`
        int i;
        int j = 0;

        // Bucle anidado `for`
        for(i = 1; i <= 10; i++){
            for(j = 5; j <= 10; j++){
                System.out.println(i + " " + j);
            }
        }

        // Imprimir los valores finales de `i` y `j`
        System.out.println("El valor con el que termino i es: " + i);
        System.out.println("El valor con el que termino j es: " + j);
    }
}