public class Empleado extends Persona {
    
    double sueldo;
    String cargo;

    public Empleado(){
    }

    public Empleado(double sueldo, String cargo, String nombre,
    String apellido, int edad){
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    //Getters
    public double getSueldo(){
        return sueldo;
    }

    public String getCargo(){
        return cargo;
    }

    //Setters
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
