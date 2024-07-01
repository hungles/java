public class Main{ 
    public static void main(String[] args) {
    
        Persona user1 = new Persona("Sebastian", "Carmona", 22);

        Persona user2 = new Persona("Pepito", "Perez", 31);

        System.out.println(user1.NombreCompleto());
        System.out.println(user2.NombreCompleto());
        //Definir un obejeto Empleado en una variable epl de Tipo Empleado
        Empleado epl = new Empleado();

        epl.getNombre();
        epl.getApellido();

        //Polimorfismo: Objetos de diferentes clases pueden ser tratados como 
        //objetos de una clase comun
        Persona vector [] = new Persona [5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();

        System.out.println(vector[0]);

        Persona per1 = new Persona();
        Persona per2 = new Persona("Jorge","Chavez",65);

        System.out.println("Nombre: " + per1.getNombre());
        System.out.println("Nombre: " + per2.getNombre());
    }
}