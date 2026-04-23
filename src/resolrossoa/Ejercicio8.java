package resolrossoa;
import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: C a F");
        System.out.println("2: F a C");
        int op = sc.nextInt();

        System.out.print("Ingrese temperatura: ");
        double t = sc.nextDouble();

        if(op == 1) {
            System.out.println((t*9/5)+32);
        } else {
            System.out.println((t-32)*5/9);
        }
    }
}