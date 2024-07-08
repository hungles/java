import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Arraylist: Es una coleccion de datos, poseen un tamaño dinamico, permite duplicados y elementos del mismo tipo
        List<Persona> lista = new ArrayList<Persona> ();

        //LinkedList: El primer dato apunta al segundo datos, los demas datos apuntan a aus datos abyacentes y el ultimo dato apunta a su penultumo dato
        List<Persona> lista2 = new LinkedList<Persona>();

        lista.add(new Persona("Carlos",34,"soltero"));
        lista.add(new Persona("Juan",32,"casado"));
        lista.add(new Persona("Maria",22,"dovorciada"));

        lista2.add(new Persona("Carlos",34,"soltero"));
        lista2.add(new Persona("Juan",32,"casado"));
        lista2.add(new Persona("Maria",22,"dovorciada"));
        lista2.add(0,new Persona("Pepito",99,"casado"));
        //recorrer por indice
        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }

        for (Persona perso:lista2){
            System.out.println(perso.getEdad());
        }


        

    }
}
 