package TABLAS;

import java.util.Arrays;

public class Actividad510 {
    /*Esceibir la funcion int[] eliminarMayores(int t[],int valor) que crea y devuelve una copia de
     * la tabla t donde se ha eleimiando todos los elementos que son mayores que valor
     */

     static int[] sinMayores(int t[], int valor){
        int copia[]=Arrays.copyOf(t, t.length);//es un clon de t
        int i =0;

        while(i<copia.length){
            if(copia[i]>valor){
                //hay que eliminar copia[i]
                copia[i]=copia(copia.length-1);//copiamos el ultimo
                //y decrementamos la longitud
                copia = Arrays.copyOf(copia, copia.length-1);
            }else{
                i++;
            }
        }
        return (copia);
     }
}
