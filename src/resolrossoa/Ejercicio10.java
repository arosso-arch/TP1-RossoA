package resolrossoa;
import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        int may=0, min=0, num=0;

        for(char c: pass.toCharArray()) {
            if(Character.isUpperCase(c)) may++;
            else if(Character.isLowerCase(c)) min++;
            else if(Character.isDigit(c)) num++;
        }

        if(pass.length()>=8 && may>=2 && min>=3 && num>=2) {
            System.out.println("Segura");
        } else {
            System.out.println("No segura");
        }
    }
}