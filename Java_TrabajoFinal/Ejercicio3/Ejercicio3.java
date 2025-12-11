package Ejercicio3;
/* Un banco ha solicitado que creemos un programa que permita determinar
cuántos billetes y monedas se le deberán facilitar a un usuario que desea
retirar un importe determinado de su cuenta corriente. Sabiendo que:
n Los billetes disponibles serán de 500€, 200€, 100€, 50€, 20€, 10€ y 5€
n Las monedas disponibles serán de 2€ y 1€
n Se deberán facilitar primero los billetes y monedas de mayor importe,
antes de recurrir a los de menor importe. */
import java.util.Scanner;

public class Ejercicio3 {
    //Creamos dos arrays de billetes y monedas
    public static final int[] BILLETES = {500, 200, 100, 50, 20, 10, 5};
    public static final int[] MONEDAS = {2, 1};

    
    public static void main(String[] args) {
        //Scanner para poder leer los datos introducidos por el usuario
        Scanner sc = new Scanner(System.in);

        //Llamamos a la función que solicita el dinero y lo valida
        int importe = consultar_importe(sc);

        //Calculamos la cantidad de billetes y monedas a pagar según el importe
        calcular_pago(importe);

        //Cerramos el Scanner
        sc.close();
        
    }
    
    //Función para solicitar el importe a retirar y si el valor es correcto
    public static int consultar_importe(Scanner sc){
        int importe= -1;

        //Bucle para controlar que la cantidad de dinero introducido si es válido, si no lo es se repetirá hasta que introduzca un valor correcto
        while(importe<=0){
            System.out.println("Introduce el importe que deseas retirar");
            //Leemos la entrada del usuario
            String dinero = sc.nextLine();

            try {
                //Convertimos la entrada del usuario a entero
                importe = Integer.parseInt(dinero);
                //Bucle para comprobar que el importe es válido
                if(importe<= 0){
                    System.out.println("ERROR: El importe debe ser mayor que 0");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Número inválido, inténtelo de nuevo");
            }
        }

        return importe;

    }

    //Función para calcular la cantidad de billetes y monedas que debe proporcionar
    public static void calcular_pago(int importe){

        System.out.println("El importe es de: " + importe + "€ en su cuenta");

        //Variable para guardar lo que falta por pagar
        int resto = importe;

        //Cálculo de la cantidad de billetes
        for(int billete : BILLETES){
            //Cantidad de billetes de este tipo
            int cantidad = resto / billete;
            if(cantidad > 0){
                System.out.println(cantidad+ " billetes de " +billete+ "€");
                resto%=billete;
            }
        }

        //Cálculo de la cantidad de monedas
        for(int moneda : MONEDAS){
            //Cantidad de monedas de este tipo
            int cantidad = resto / moneda;
            if(cantidad > 0){
                System.out.println(cantidad+ " monedas de " +moneda+ "€");
                resto%=moneda;
            }
        }

    }
}
