import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Actividad52 {
    public static void main(String[] args) {
        /*Diseñar un programa  que solicite al usuario que introduzca por teclado 5 números decimales.
         * A continuación, mostrar los números en el mismo orden que se ha introducido
         */
        //Para guardar los numeros bamos a utilizar una tabla con 5 elementos.
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);//para separar decimales con punto y no con coma
        double t[] = new double[5];
        //recorrer para leer los valores

        for(int i =0;i<5;i++){
            System.out.println("Introduzca un numero decimal");
            t[i]=sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));

        sc.close();
    }
}
