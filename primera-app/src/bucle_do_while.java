public class bucle_do_while {
    public static void main(String[] args) throws Exception {

        int contador = 1;
        //Siempre se ejecuta el do hasta donde el while lo permita
        do{

            System.out.println("Esto sucede antes de la condicion");

            contador++;

        } while(contador <=5);

        System.err.println(contador);
    }
}