public class User2 extends Personaje implements Heraldos {
    
    public User2(){}
    
    @Override
    public void attack(){
        System.out.println("ATAQUE DE USER2!!!");
    }
    public void deffense(){
        System.out.println("USER2 SE DEFENDIO!!!");
    }
    public void useMagic(){
        System.out.println("USER2 USO MAGIA!!");
    }

    public void construirTorres(){
        System.out.println("Construyendo torres");
    }
    public void usarMana(){
        System.out.println("Usando Mana");
    }
}
