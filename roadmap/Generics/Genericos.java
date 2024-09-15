import java.util.ArrayList;
import java.util.List;

public class Genericos {


    public static void main(String[] args) {
        
        
        System.out.println("hola mundo");

        Tipo<String> tipo = new Tipo<>("Hola como estas");

        tipo.retornarValor();

        Tipo<Integer> tipo2 = new Tipo<>(1234);

        tipo2.retornarValor();

        tipo.retornarTipo();

        tipo2.retornarTipo();


    }

}
