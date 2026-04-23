package resolrossoa;
import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese palabra: ");
        String palabra = sc.nextLine();

        String invertida = "";

        for(int i=palabra.length()-1; i>=0; i--) {
            invertida += palabra.charAt(i);
        }

        if(palabra.equalsIgnoreCase(invertida)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}