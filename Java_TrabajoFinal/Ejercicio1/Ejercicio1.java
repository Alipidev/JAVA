import java.util.Scanner;
/* Crea un programa que compruebe si un número introducido por el usua-
rio es un número primo o no */

public class Ejercicio1 {
    public static void main(String[] args) {

        int numeroUsuario = obtenerNumero();
        if(es_primo(numeroUsuario)){
            System.out.println("El número " + numeroUsuario + " es primo");
        }else{
            System.out.println("El número " + numeroUsuario + " no es primo");
        }
        
    }

    //Función que solicita número entero por teclado y verifica si es entero, si es un número y se es así lo devuelve
    public static int obtenerNumero(){
        //Importamos e incializamos el Scanner
        Scanner sc = new Scanner(System.in);
        //Utilizamos un bucle while para comprobar lo que introduce el usuario por teclado
        while (true) { 

            //Se pide el número por teclado
            System.out.println("Introduce un número entero");
            String numero = sc.nextLine();
            

            //Utilizamos try catch para ver si es entero
            try {
                double entrada = Double.parseDouble(numero);

                //Comprobamos si es entero
                if(entrada % 1 !=0){
                    System.out.println("ERROR: El dato introducido no es un número entero y por tanto no es válido. Inténtelo de nuevo.");
                }else{
                    //Convertimos en número entero(int)
                    return (int) entrada;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: El dato introducido no es un número entero y por tanto no es válido. Inténtelo de nuevo");
            }
            sc.close();
        }
        
        
    }
    
    //Función para comprobar si el número entero es primo o no
    public static boolean es_primo(int numeroUsuario){
        //Los números menores que 2 no pueden ser primos
        if (numeroUsuario < 2){
            return false;
        }
        //Comprobamos si es divisible desde 2 hasta su raíz cuadrada
        for(int i = 2; i <= Math.sqrt(numeroUsuario);i++){
            if(numeroUsuario % i ==0){
                //Si se encuentra un divisor no es primo
                return false;
            }
        }
        //El bucle termina si es primo
        return true;
        

    }
}
