import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException; 

public class Manejo_Archivos {

    public static void main(String[] args) {
        
        File myObj = new File("filename.txt");
        try {
            // Crando el archivo con nombre filename.txt
            //Valida si existe el archivo en el sistema
            if (myObj.createNewFile()){
                System.out.println("Se ha creado el archivo " + myObj.getName());
            }
            else{
                //Si el archivo ya existe en el sistema, imprime lo siguiente en pantalla
                System.out.println("El archivo " + myObj.getName() + " ya existe en el sistema");
            }

        } catch (IOException e) {
            //Excepcion en caso no se pueda crear el archivo
            System.out.println("Ocurrio un error inesperado, vuleva a intentar");
            e.printStackTrace();
        }


        //Vamos a escribir texto en el archivo filename que creamos
        try {
            //Creando la clase que escribe texto en el archivo
            FileWriter archivoEscrito = new FileWriter("filename.txt");
            //Texto a copiar en el archivo
            archivoEscrito.write("Esto es un texto escrito desde la metodo write de la clase FileWritter");
            archivoEscrito.close();
            System.out.println("Se ha escrito en el archivo satisfactoriamente");
        }
        catch (IOException e) {
        //Exepcion en caso halla algun problema al momento de copiar el contenido
        System.out.println("No se pudo escribir en el archivo");
        e.printStackTrace();

        }

        //Vamos a leer un archivo con la clase Scanner

        try {
            File archivoLeido = new File("filename.txt");
            Scanner leerArchivo = new Scanner(archivoLeido);
            while(leerArchivo.hasNextLine()){
                String data = leerArchivo.nextLine();
                System.out.println(data);
            }
            leerArchivo.close();

        } catch (FileNotFoundException e) {

            System.out.println("Ha ocurrido un error al leer el archivo");

        }

        //Obtener informacion del archivo

        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            } else {
            System.out.println("The file does not exist.");
        }
        

        if(myObj.delete()){
            System.out.println("el archivo ha sido eliminado");
        }
        else {
            System.out.println("Fallo al eliminar el archivo");
        }



    }


}
