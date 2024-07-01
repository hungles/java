public class primera_app{ 
    public static void main(String[] args) {
    
        persona persona1 = new persona();
        persona1.nombre = "Sebastian";
        persona1.apellido = "Carmona";
        persona1.edad = 22;

        persona persona2 = new persona();
        persona2.nombre = "Carlos";
        persona2.apellido = "Martinez";
        persona2.edad = 32;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ciencias de la computacion";
        carrera1.duracion = 5;
        carrera1.enCurso = true;

        persona1.carrera = carrera1;
        
        Carrera carrera2 = new Carrera();     
        carrera2.nombre = "Medicina";
        carrera2.duracion = 7;
        carrera2.enCurso = false;

        persona2.carrera = carrera2;

        System.out.println(persona1.NombreCompleto() + " " + persona1.carrera.estudianteOegresado() + " de la carrera de: " + persona1.carrera.nombre + " con una duracion de " + persona1.carrera.duracion + " años");
        System.out.println(persona2.NombreCompleto() + " " + persona2.carrera.estudianteOegresado() + " de la carrera de: " + persona2.carrera.nombre + " con una duracion de " + persona2.carrera.duracion + " años");

    }
}