public class User1 extends Personaje implements Caballeros {

    public User1(){}
    
    @Override
    public void attack(){
        System.out.println("ATAQUE DE USER1!!!");
    }
    public void deffense(){
        System.out.println("USER1 SE DEFENDIO!!!");
    }
    public void useMagic(){
        System.out.println("USER1 USO MAGIA!!");
    }

    public void reclutarAliados(){
        System.out.println("Reclutando aliados");
    }
    public void masDefensa(){
        System.out.println("AumentandoDefensa");
    }
    public void noMana(){
        System.out.println("No puedo usar eso!!");
    }

}
