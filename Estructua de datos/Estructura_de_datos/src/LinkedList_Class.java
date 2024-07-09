import java.util.LinkedList;

public class LinkedList_Class {
    public static void main(String[] args) {
        
        LinkedList<String> marcas = new LinkedList<String>();  

        marcas.add("McDonals");
        marcas.add("Samsung");
        marcas.add("Volvo");

        System.out.println(marcas);

        marcas.add(2,"Apple");

        System.out.println(marcas);

    }
}
