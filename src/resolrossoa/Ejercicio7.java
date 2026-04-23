package resolrossoa;
import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1-Sumar 2-Restar 0-Salir");
            op = sc.nextInt();

            if(op == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            } else if(op == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a-b);
            }

        } while(op != 0);
    }
}