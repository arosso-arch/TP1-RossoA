package resolrossoa;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int numero = (int)(Math.random()*100)+1;
        int intento;

        do {
            System.out.print("Adivina el numero: ");
            intento = sc.nextInt();

            if(intento > numero) {
                System.out.println("Mas bajo");
            } else if(intento < numero) {
                System.out.println("Mas alto");
            }

        } while(intento != numero);

        System.out.println("Correcto!");
    }
}