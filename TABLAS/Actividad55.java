
import java.util.Arrays;

public class Actividad55 {
    /*Escribir la funcion int [] rellenaPares(int lonngitud, int fin), que crea y devuelve
     * una tabla ordenada de la longitud especificada, que se encuentra rellena con numeros
     * pares aleatorios comprendidos en el ranfo desde 2 hasta fin(inclusive)
     */
    static int [] rellenaPares(int longitud, int fin){
        //creamos al tabla com la longitud adecuada
        int pares[]= new int[longitud];
        int i =0;
        
        //Terminaremos de rellenar la tabla con el numero de pares sea igual a la longitud
        while(i<pares.length){
            int num = (int)(Math.random()*fin+1);
            if(num%2==0){//si es par
                pares[i]= num;//se guarda en i
                i++;//incrementamos el indicador
            }
        }
        //ordenamos la tabla
        Arrays.sort(pares);
        return(pares);
    }
}
