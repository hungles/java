import java.util.HashSet;;

public class HashSet_Class {
    
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>();

        //Agregando elementos a un HashSet

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

        //Ver si un elemento esta en la lista (devuelve un booleano)

        System.out.println(cars.contains("BMW"));

        //Todos los elementos deben ser unicos

        cars.add("Volvo");

        System.out.println(cars);

    }

}
