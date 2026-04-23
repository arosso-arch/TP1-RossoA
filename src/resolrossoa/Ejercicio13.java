package resolrossoa;
public class Ejercicio13 {
    public static void ejecutar() {

        String[] nombres = {"Juan","Ana","Luis"};
        double[][] notas = {
            {7,8,9},
            {6,7,8},
            {9,9,10}
        };

        for(int i=0;i<3;i++) {
            double suma=0;
            for(int j=0;j<3;j++) {
                suma += notas[i][j];
            }
            System.out.println(nombres[i]+" promedio: "+(suma/3));
        }
    }
}