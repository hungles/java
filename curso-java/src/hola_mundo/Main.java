package hola_mundo;

import POO.Animales;
import POO.DiaDeLaSemana;
import POO.Gatos;
import POO.Genericos;
import POO.Pato;
import POO.Perros;
import POO.Var_final;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        
        Animales perro = new Perros(4, true, 5, "Firulais", "Chusco");
        Animales gato = new Gatos(4, true, 12, "Manolo", "Naranja");
        Animales pato_animal = new Pato(2, false, 3);
        perro.hacerRuido();
        gato.hacerRuido();

        Pato pato = (Pato) pato_animal;
        
        pato.volar();

        Var_final circulo = new Var_final();

        System.out.println(circulo.arearCirculo(3));

        //ENUMS

        DiaDeLaSemana dia = DiaDeLaSemana.LUNES;

        //Uso de los genericos en JAVA

        Genericos<String> genericos = new Genericos<>();

        genericos.setDato("Hola mundo");
        
        //ArrayList

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(0,12);
        lista.add(1,123);
        lista.add(2,121);

        System.out.println(lista);

        lista.remove(0);

        System.out.println(lista);

        //Try y Catch

        int[] testLista = new int[3];

        //testLista[3] = 12;

        try {
            testLista[1] = 12;
            System.out.println("Felicidades a insertado su valor con exito!!");
        } catch (Exception e) {
            System.out.println("Lo sentimos pero el valor insertado es invalido");
        } finally {
            System.out.println("Estamos regresando a la pagina principal, por favor espere");
        }

    }



}
