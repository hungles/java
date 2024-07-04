package Sobrecarga_Sobreescritura.src;

public class Sobrecarga {
    
    private int id_animal;
    private String descripcion;

    //Sobrecarga de metodos: Se puede tener mas de un metodo con el mismo nombre, pero que reciban diferenetes parametros

    public void hacerRuido(){
        System.out.println("El animal hace ruido");
    }

    public void hacerRuido(String animal){
        System.out.println("El " + animal + " hace ruido");
    }

    public void hacerRudio(String animal, String tipoSonido){
        System.out.println("El " + animal + " hace un sonido de tipo " + tipoSonido);
    }

    //

}
