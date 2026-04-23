package resolrossoa;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese palabra: ");
        String palabra = sc.nextLine();

        int contador = 0;

        for(int i=0; i<palabra.length(); i++) {
            char c = palabra.toLowerCase().charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                contador++;
            }
        }

        System.out.println("Vocales: " + contador);
    }
}