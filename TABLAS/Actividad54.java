public class Actividad54 {
    public static void main(String[] args) {
        /*Diseñar la funcion int maximo(int t[]), que devuelva el maximo valor que tenga la
         * tabla t
         */

    }

    static int maximo(int t[]){
        //El primer elemento es el maximo por defecto
        int max = t[0];

        //Recorreremos para buscar el elemnto mauor
        for(int e: t){
            if(e>max){
                max=e;
            }
        }
        return(max);
}
}
