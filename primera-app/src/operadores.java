public class operadores {
    public static void main(String[] args) throws Exception {

        // Operadores: Simbolos que siven para hacer operaciones con variables o valores

        //Aritmeticos:

        int a = 1421;

        int b = a % 2; // El resto nos sirve para saber si un numero es par o impar



        System.out.println(b);

        // ASIGNACION

        int c = 5;
        c=10;
        c=21;
        c+=15;
        c-=30;
        c*=2;
        c/=2;
        c++;
        c++;
        c--;
        System.out.println(c);

        // Comparacion

        int n1 = 15;
        int n2 = 16;

        boolean esMayor = n2 > n1;
        boolean esMenor = n2 > n1;
        boolean esIgual = n2 == n1;
        boolean esMayorIgual = n2 >= n1;
        boolean esMenorIgual = n2 >= n1;
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);
        System.out.println(esMayorIgual);
        System.out.println(esMenorIgual);

        // Operadores de Logica

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; //AMBOS POSITIVOS = TRUE
        boolean resultadoOR = condicion1 || condicion2; // UNO POSITIVO = TRUE
        boolean resultadoNOT = !condicion1; // EL INVERSO DEL BOOLEANO TRUE = !FALSE

        System.out.println(resultadoAND);
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);

    }
}