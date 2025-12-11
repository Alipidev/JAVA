

public class Actividad51{
    public static void main(String[] args) {
        /*Crea una tabla de longitud 10 que se inicializará con números aleatorios comprendidos
         * entre 1 y 100. Mostrar la suma de todos los números aleatorios que se guardan en la tabla
         */

         int valores[];
         valores = new int[10];

         //Recorremos la tabla para incializar con valores aleatorios
         for(int i=0;i<valores.length;i++){
            valores[i]=(int)(Math.random()*100+1);
         }
         //Ahora recorremos la tabla para calcular la suma de todos los elementos
         int suma=0;
         for(int valor:valores){
            suma+=valor;
         }
         System.out.println("La suma de todos los valores es: " +suma);
        
    }
}