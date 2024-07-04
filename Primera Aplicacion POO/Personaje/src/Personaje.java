public abstract class Personaje {
    // Definimos los metodos que tendran todos los personajes que creemos
    protected String nickname;
    protected int level;
    protected double coins;
    protected String rango;

    // Definimos las acciones que puede ejecutar todos los personajes
    public abstract void attack();
    public abstract void deffense();
    public abstract void useMagic();
}
