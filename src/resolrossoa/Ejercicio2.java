package resolrossoa;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}