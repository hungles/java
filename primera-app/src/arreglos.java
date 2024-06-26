public class arreglos {
    public static void main(String[] args) throws Exception {

        //Arreglos: Son estructuras de datos que tienen valores del mismo tipo
        //bajo un mismo nombre, se pueden acceder a los valores por el indica
        //SE LLAMAN VECTORES O MATRICES

        int[] numeros = new int[5];
        int[] numeros_otro = {10,20,30,40,50};
        char[] letritas = new char[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 1212;
        numeros[3] = 4;
        letritas[0] = 'a';
        letritas[1] = 'b';
        letritas[2] = 'd';
        letritas[3] = 'z';

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros_otro.length; i++) {
            System.out.println(numeros_otro[i]);
        }

        for (int i = 0; i < letritas.length; i++) {
            System.out.println(letritas[i]);
        }
    }
}