package resolrossoa;
import java.util.*;

public class Ejercicio12 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 5 numeros: ");
        int[] arr = new int[5];

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=4;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}