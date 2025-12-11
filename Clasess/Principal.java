package Clasess;

import java.util.Arrays;
import java.util.Scanner;

//Clase principal ejecutable

public class Principal {
    public static void main(String[] args) {
        //Que nos de el usuario los valores y asociarlo al objeto
        //LLamar la clase Scanner
        final Scanner MY_SCANNER = new Scanner(System.in);
        //Que el usuario elija la marca y el color
        //Declaramos un conjunto de strings
        String marcas[] = {"Seat","Citroen", "Opel"};
        String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Amarillo", "Gris", "Verde"};
        String marcaElegida, colorElegido,puertas,velocidad;
        int numPuertas;
        double maxVelocidad;

        //preguntar al usuario por la marca del vehiculo
        while (true){
            System.out.println("Indique la marca de su vehiculo entre las siguientes: ");
            /*
                - Bucle for
                for(int i =0; i<marcas.length; i++){
                    System.out.println(marcas[i]);
                }
                - Metodo toString de la clase Arrays
                    System.out.println(Arrays.toString(marcas));
             */
            Arrays.stream(marcas).forEach(System.out::println);
            marcaElegida = MY_SCANNER.nextLine();
            //comprobar si el dato es correcto
            if(Arrays.asList(marcas).contains(marcaElegida)){
                break;
            }else{
                System.out.println("Lo sentimos, no entendemos su opcion");
            }   

        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        //preguntarle el color
        while (true) {
            System.out.println("Indique el color de los siguientes");
            Arrays.stream(colores).forEach(System.out::println);
            colorElegido = MY_SCANNER.nextLine();

            if(Arrays.asList(colores).contains(colorElegido)){
                break;
            }else{
                System.out.println("Lo sentimos no esta");
            }
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        //preguntarle por el numero de puertas
        while (true) { 
            System.out.println("Indique el numero de puertas");
            puertas = MY_SCANNER.nextLine();

            //convertir string a int
            try {
                numPuertas = Integer.parseInt(puertas);
                //Nos aseguramos de la cantidad de puertas que tiene
                if(numPuertas>2 && numPuertas<6){
                    break;
                }else{
                    System.out.println("Indica numero correcto");
                }
            } catch (Exception e) {
                System.out.println("Lo sentimos");
            }
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        //preguntarle velocidad
        while (true) { 
            System.out.println("Indique la maxima velocidad");
           velocidad= MY_SCANNER.nextLine();

            try {
                maxVelocidad = Double.parseDouble(velocidad);
                break;
            } catch (Exception e) {
                System.out.println("Lo sentimos");
            }
            
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        //Cerrar el scanner porque no lo vamos a utilizar mas
        MY_SCANNER.close();

        // creamos objeto y lo sacamos por pantalla

        Coche miCoche = new Coche(marcaElegida, colorElegido, numPuertas, maxVelocidad);
        miCoche.description();








        //creamos un coche a traves del metodo constructor
        /* 
        Coche coche = new Coche();
        Coche coche2=new Coche("Audi", "Amarillo");
        Coche coche3=new Coche("Seat", "Rojo", 4, 200.0);

        //Utilizas el setter para poner la marca
        coche.setMarca("Ford");
        //Getter
        System.out.println(coche2.getMarca());
        System.out.println(coche.getMarca());
        //coche.description();
        //coche2.description();
        //coche3.description();
        System.out.println(coche);//Invoca el toString
        */

        

    }
}
