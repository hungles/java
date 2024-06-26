public class if_else {
    public static void main(String[] args) throws Exception {
// if y else con estructuras de control que permiten hacer condiciones a mi codigo

        int edad = 60;

        if (edad > 18 && edad <= 60){
            System.out.println("Entrar a la discoteca!!!");
        } else if (edad == 18){
            System.out.println("Tienes la edad justo para ingresar, no te olvides tu DNI");
        } else if (edad > 60){
            System.out.println("No puede ingresar, superaste la mayoria de edad");
        }else{
            System.out.println("No puedes entrar a la discoteca!!!");
        }

    
    }
}