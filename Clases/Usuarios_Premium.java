package Clases;

public class Usuarios_Premium extends Usuarios implements Interfaz{

    private int diasSuscripcion;
    private String tipoSuscripcion;
    private boolean serviciosAdicionales;

    public Usuarios_Premium(
                            String nombre, String apellido,
                            int edad, String correo,
                            int diasSuscripcion, String tipoSuscripcion, 
                            boolean serviciosAdicionales){
                                super(nombre, apellido, edad, correo);
                                this.diasSuscripcion = diasSuscripcion;
                                this.tipoSuscripcion = tipoSuscripcion;
                                this.serviciosAdicionales = serviciosAdicionales;
    }

    @Override

    public void acciones1(){
        System.out.println("Se esta realizando la accion 1");
    }

    public void acciones2(){
        System.out.println("Se esta realizando la accion 2");
    }

    public void acciones3(){
        System.out.println("Se esta realizando la accion 3");
    }


}
