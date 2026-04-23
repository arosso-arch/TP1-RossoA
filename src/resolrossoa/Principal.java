package resolrossoa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 al 14 - Ejecutar ejercicio");
            System.out.println("0 - Salir");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1: Ejercicio1.ejecutar(); break;
                case 2: Ejercicio2.ejecutar(); break;
                case 3: Ejercicio3.ejecutar(); break;
                case 4: Ejercicio4.ejecutar(); break;
                case 5: Ejercicio5.ejecutar(); break;
                case 6: Ejercicio6.ejecutar(); break;
                case 7: Ejercicio7.ejecutar(); break;
                case 8: Ejercicio8.ejecutar(); break;
                case 9: Ejercicio9.ejecutar(); break;
                case 10: Ejercicio10.ejecutar(); break;
                case 11: Ejercicio11.ejecutar(); break;
                case 12: Ejercicio12.ejecutar(); break;
                case 13: Ejercicio13.ejecutar(); break;
                case 14: Ejercicio14.ejecutar(); break;
            }
        } while(opcion != 0);
    }
}

