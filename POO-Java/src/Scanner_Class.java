import java.util.Scanner;

public class Scanner_Class {
    
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Insert your name: ");

        String username = read.nextLine();
        System.out.println("Your name is " + username);

        System.out.println("Insert your age");

        int age = read.nextInt();

        System.out.println("You are " + age + " old");

    }

}
