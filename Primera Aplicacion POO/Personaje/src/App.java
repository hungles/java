public class App {
    public static void main(String[] args) throws Exception {

        User1 usuario1 = new User1();
        User2 usuario2 = new User2();

        usuario1.attack();
        usuario2.attack();

        usuario1.reclutarAliados();
        usuario2.construirTorres();

        usuario1.masDefensa();
        usuario2.deffense();

    }
}
