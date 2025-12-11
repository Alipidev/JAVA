
import java.util.Arrays;
import java.util.Scanner;

public class Actividad58 {
    /*Leer y alamcenar n numeros enteros en una tabla, a partir de la que se construiran otras dos tablas con los elementos
     * con valores pares e mimpares de la primera. respectivamente. Las tablas pares e impares deben
     * mostrarse ordenadas
     */

     /*COmo las tablas con los numeros pares e impares tienen que star ordenadas, lo que haremos sera
      * ordenar los datos de la entrada 
      */
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int datos[];//Tabla de datos iniciales
          //creamos las tablas de pares e impar con inciilizar en 0
          int par[] = new int[0];
          int impar[]=new int[0];

          System.out.println("Esscribe n: ");
          int n = sc.nextInt();//n es el numero de datos a leer
          datos = new int[n];//se crea tabla con longitud n

          //leemos por teclado los valores de la tabla
          for(int i=0;i<datos.length;i++){
            System.out.println("Introduzca un numeros");
            datos[i]=sc.nextInt();
          }

          //recorremos los datos para clasificarlos
          for(int numero : datos){
            //al estar los datos ordenados se insertan igual impar que par
            if(numero%2==0){//si el numero es par
                par = Arrays.copyOf(par,par.length+1);//se incrementa la longitud de par
                par[par.length-1]=numero;//guardo el numero en el ultimo elemento
                }else{
                    impar=Arrays.copyOf(impar,impar.length+1);
                    impar[impar.length-1]=numero;
                }
          }
          System.out.println("Pares " +Arrays.toString(par));
          System.out.println("Impares " +Arrays.toString(impar));
      }
}
