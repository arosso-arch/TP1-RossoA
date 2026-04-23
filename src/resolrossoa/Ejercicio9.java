package resolrossoa;
import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        String texto = sc.nextLine();

        String[] palabras = texto.split(" ");
        System.out.println("Cantidad: " + palabras.length);
    }
}