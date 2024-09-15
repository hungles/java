package POO;

public class Pato extends Animales implements Ave {

    
    public Pato(int numeroPatas, boolean tieneCola, int edad){
        super(numeroPatas,tieneCola,edad);
    }

    @Override
    public void hacerRuido(){
        System.out.println("Cuackkk");
    }

    @Override
    public void volar(){
        System.out.println("El pato vuela alto");
    }

}
