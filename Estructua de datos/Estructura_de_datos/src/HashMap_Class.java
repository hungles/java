import java.util.HashMap;

public class HashMap_Class {
    
    public static void main(String[] args) {
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        //Obtener el valor de una key en el HashMap

        System.out.println(capitalCities.get("England"));

        //Eliminar un elemento del HashMap

        capitalCities.remove("England");

        System.out.println(capitalCities);

        //Calcular cuantos elementos tiene mi HashMap

        System.out.println(capitalCities.size());

        //Borrar todos los elemetos

        capitalCities.clear();

        System.out.println(capitalCities);
    }

}
