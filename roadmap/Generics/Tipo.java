public class Tipo <T> {

    private T asignarTipo;

    public Tipo(){};

    public Tipo(T asignarTipo){
        this.asignarTipo = asignarTipo;
    }

    public void setAsignarTipo(T asignarTipo){
        this.asignarTipo = asignarTipo;
    }

    public void retornarValor(){
        System.out.println(asignarTipo);
    }

    public void retornarTipo(){
        System.out.println(asignarTipo.getClass().getName());
    }
}
