
import java.util.Arrays;

public class Actividad56 {
    /*Definir una funcion que tome como parametros dos tablas, la primera con los 6 numeros de una
     * apuesta primitva y la segunda(ordenada) con los 6 numeros de la combinacion ganadora.
     * La funcio devolvera el numero de aciertos
     */

     //devulve el numero de coincidencias entre los elementos de la tabla
     static int primitiva(int apuesta[], int[]combinacionGanadora){
        int aciertos = 0;//contador de aciertos

        //tabla de apuesta
        for(int a:apuesta){
            //Aprovechamos que la tabla de la combinacion esta ordenada
            if(Arrays.binarySearch(combinacionGanadora,a)>=0){
                //si esta
                aciertos++;//hemos acertado un numero mas
            }
        }
        return (aciertos);
     }
}
