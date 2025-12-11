import java.util.Arrays;

public class Actividad57 {
    /*Implementar la funcion int[] sinRepetidos(int t[]),, que construye y devuelve una tabla
     * de la longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos
     */


     /*Vamos a crear una tabla con longitud inicial 0, a la que llamamremos temporal. Recorreremos
      * la tabla t comprobando que sus elementos no se encuentra en la tabla temporal
      (metodo buscar), Si el elemento no esta en temporal se insertara
      */

      static int[] sinRepetidos(int[]t){
        int temporal[]=new int[0];//creamos con longitud 0

        for(int elemento : t {
            if(buscar(temporal,elemento)==-1){//si no esta insertamos
                //algoritmo de insercion
                temporal=Arrays.copyOf(temporal, temporal.length+1);
                temporal[temporal.length-1]=elemento;//añadimos al final
            }
            
        }
        return(temporal);
      }
}
