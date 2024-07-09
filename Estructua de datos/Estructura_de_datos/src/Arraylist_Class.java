import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Arraylist_Class {

    public static void main(String[] args){

    List<String> carros = new ArrayList<String>();

    //Agregando datos al ArrayList

    carros.add("Toyota");
    carros.add("Hyundai");
    carros.add("Mazda");

    //Insertar elementos al inicio
    
    carros.add(0,"Suzuki");

    System.out.println(carros);
    
    System.out.println(carros.get(0));

    //Cambiar un dato mediante el indice

    carros.set(0,"Subaru");

    System.out.println(carros);
    
    //Eliminar un elemento a travez del indice

    carros.remove(carros.size()-1);

    System.out.println(carros);

    //Calcular la cantidad de elementos de una lista

    System.out.println(carros.size());

    //Eliminar todos los elementos de una lista

    carros.clear();

    carros.add("Toyota");
    carros.add("Hyundai");
    carros.add("Mazda");

    //Recorrer los elemetos de una lista

    for (String car : carros) {
        System.out.println(car);
    }

    //Usar el metodo sort() de la clase Collection para ordenar la lista

    Collections.sort(carros);

    for (String car : carros) {
        System.out.println(car);
    }


    }

}
