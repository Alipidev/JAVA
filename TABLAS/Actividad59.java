package TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad59 {
    /*Diseñar una aplicacion para gestionar un campamento, donde se introduce la puntuacion de 5 progrmadores
     * La app debe mostrar las puntuaciones ordenadas. En ocasiones cuado finalizan, se suman al 
     * campeonato progr de echibicion cuyos puntos se incluyen
     */
    public static void main(String[] args) {
        /*Leeremos las puntuaciones en orden, realizaremos la insercion ordenada */
        Scanner sc = new Scanner(System.in);
        int puntos[]=new int[5];//incialmente intervienen 5 programadores

        for(int i =0;i<5;i++){
            System.out.println("Puntos programador ("+(i+1)+"):");
            puntos[i]=sc.nextInt();//leemos los datos que no estan ordenados
        }
        Arrays.sort(puntos);//ordenamos
        System.out.println("Puntuacion: " +Arrays.toString(puntos));

        System.out.println("Puntos del programador de exhibicion");
        int puntosProgExh=sc.nextInt();//puntuacion del programador de exhibicion

        while(puntosProgExh != -1){
            int pos= Arrays.binarySearch(puntos, puntosProgExh);//buscamos
            int indiceInsercion;//donde insertar para que la tabla siga ordenada
            if(pos<0){
                indiceInsercion= -pos -1;//Indice para que la tabla este ordenada
            } else{
                indiceInsercion= pos;//puntuacion repetida ya esta en la tabla
            }

            int copia[]= new int [puntos.length+1];//nueva tabla
            //copiamos los elementos antes del hueco
            System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
            //copiamos despazados los elementos tras el hueco
            System.arraycopy(puntos, indiceInsercion, copia, indiceInsercion+1,puntos.length-indiceInsercion);

            copia[indiceInsercion]=puntosProgExh;//asignamos el nuevo elemento
            puntos=copia;

            System.out.println("Puntos del porg d exh");
            puntosProgExh=sc.nextInt();
        }

        System.out.println("Puntuacion final: " +Arrays.toString(puntos));

        sc.close();
    }
}
