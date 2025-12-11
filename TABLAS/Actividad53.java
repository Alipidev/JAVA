import java.util.Scanner;

public class Actividad53 {
    public static void main(String[] args) {
        /*Escribir una app que solicite al usuario cuantos numeros desea introducir. Ac continuacion,
         * introducir por teclado esa cantidad de numeros enteros y mostrar el orden inverso
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("CUantos numeros desea introducir");
        int cuantosNumeros=sc.nextInt();

        int t[]= new int[cuantosNumeros];
        //recorremos desde 0 hasta t.lenght-1
        for(int i =0;i<t.length;i++){
            System.out.println("Introduzca un numero");
            t[i]=sc.nextInt();
        }

        //Para recorrerlo en orden invero
        System.out.println("Los numeros en orden inverso son: ");
        for(int i=t.length-1;i>=0;i--){
            System.out.println(t[i]);
        }

        sc.close();
    }
}
