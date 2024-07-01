public class primera_app{ 
    public static void main(String[] args) {
    
        Persona user1 = new Persona("Sebastian", "Carmona", 22);

        Persona user2 = new Persona("Pepito", "Perez", 31);

        System.out.println(user1.NombreCompleto());
        System.out.println(user2.NombreCompleto());

    }
}