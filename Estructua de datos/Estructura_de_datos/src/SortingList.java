import java.util.Collections;
import java.util.ArrayList;

public class SortingList {
    
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        
        //Ordena los enteros de forma ascendente
        Collections.sort(myNumbers);

        for (Integer i : myNumbers) {
            System.out.println(i);
        }

        // Ordena los enteros de forma descendente

        Collections.sort(myNumbers, Collections.reverseOrder());

        for (Integer i : myNumbers) {
            System.out.println(i);
        }
    }

}
