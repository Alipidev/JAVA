package Ejercicio4;
/* Crear un programa que pida una frase al usuario
y cuente las palabras que tiene y las vocales */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Pedimos la frase al usuario
        String frase = solicitar_frase();

        //Cuenta cuantas palabras tiene
        contar_palabras(frase);

        //Cuenta cuantas letras tiene
        contar_letras(frase);

        //Convertimos la frase en un array
        char[] caracteres = string_to_char(frase);


        //Cuenta las palabras que al menos tienen una vocal
        contar_vocales(caracteres);
    }

    /*Función para solicitar al usuario la primera frase de su libro favorito 
    y la muestre por pantalla*/
    public static String solicitar_frase(){

        //Inicializamos el scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera frase de su libro favorito");
        //Creamos una variable para guardar la frase
        String primeraFrase = sc.nextLine().trim();

        //La mostramos por pantalla
        System.out.println("Su frase es: ");
        System.out.println(primeraFrase);

        return primeraFrase;
    }

    //Función para contar palabras
    public static void contar_palabras(String primeraFrase){

        //Utilizamos el método trim() para eliminar espacions en blanco iniciales y finales
        //Utilizamos split() para dividir la frase
        String[] palabras = primeraFrase.trim().split("\\s+");

        //Mostramos por pantalla el resultado
        System.out.println("La frase tiene " + palabras.length+ " palabras");
    }

    //Función para que cuente cuantas letras tiene la frase
    public static void contar_letras(String primeraFrase){

        int contador = 0;

        //Recorremos todos los caracteres de la frase
        for(char c : primeraFrase.toCharArray()){

            if(Character.isLetter(c)) contador++;
        }
        //Se muestra por pantalla el resultado
        System.out.println("La frase tiene " +contador+ " letras");
    }

    //Función para generar una variable para que asocie los caracteres.
    public static char[] string_to_char(String primeraFrase){

        //Convertimos la frase y devolvemos el array de caracteres
        return primeraFrase.toCharArray();
    }

    /*Función que recibe string_to_char y cuenta las palabras que 
    contengan como mínimo una vocal y lo muestre por pantalla*/
    public static void contar_vocales(char[] caracteres){

        String primeraFrase = new String(caracteres);

        //Separamos la frase en palabras usando espacios
        String[] palabras = primeraFrase.split("\\s+");
        //Definimos la lista de vocales
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";

        //Creamos el contador total para que cuente las palabras que tienen vocales
        int total = 0;

        System.out.println("Palabras que contienen vocales:");

        //Utilizamos el bucle for para recorrer todas las palabras
        for(String palabra : palabras){
            //Definimos el contador para la cantidad de vocales que tiene cada palabra
            int contador = 0;

            //Recorremos el array
            for(char c : palabra.toCharArray()){
                //Si el caracter está en el string de vocales ya definidio lo contamos
                if(vocales.indexOf(c)!= -1){
                    contador++;
                }
            }

            //Si tiene al menos una vocal lo mostramos por pantalla
            if(contador>0){
                total++;
                //Mostramos por pantalla el resultado
                System.out.println("La palabra " +palabra+ " tiene " +contador+ " vocales");
            }
        }

        //Mostramos por pantalla cuantan palabras tienen vocales
        System.out.println("El total número de palabras que al menos tenga una vocal es " +total);
    }

    
}
