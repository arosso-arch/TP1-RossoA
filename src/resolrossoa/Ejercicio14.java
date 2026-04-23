package resolrossoa;

public class Ejercicio14 {

    public static void mostrar(int[][] m) {
        for(int[] fila : m) {
            for(int num : fila) {
                if(num != 0)
                    System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void ejecutar() {

        int[][] m = {
            {1,2,0,3,0,7},
            {0,0,0,0},
            {0,6,9,8,0,9,6},
            {0,0,0,0,7,9,0,0},
            {0,0,0,0,0},
            {8,7,0,8,9,0,8}
        };

        mostrar(m);
    }
}