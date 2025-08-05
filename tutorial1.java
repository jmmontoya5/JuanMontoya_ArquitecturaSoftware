import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class tutorial1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        try {
            FileWriter escritor = new FileWriter("nombre.txt");
            escritor.write(nombre);
            escritor.close();
            System.out.println("Archivo creado y escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo.");
            e.printStackTrace();
        }
        scanner.close();
    }
}