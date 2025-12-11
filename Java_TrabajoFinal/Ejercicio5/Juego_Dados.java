package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Juego_Dados {

    //Creamos las constantes del juego tanto los puntos totales y las rondas seguidas para ganar
    private final int PUNTOS_GANAR = 10;
    private final int RONDAS_GANAR = 5;

    //Creamos las variables de los 2 jugadores, puntos y rondas ganadas
    private final String jugador1;
    private final String jugador2;

    private int puntosJ1=0;
    private int puntosJ2=0;

    private int rondasJ1=0;
    private int rondasJ2=0;

    //Para lanzar los dados
    private Random random = new Random();
    //Para leer las respuesta de SI o NO
    private Scanner sc = new Scanner(System.in);

    //Creamos el constructor
    public Juego_Dados(String jugador1, String jugador2){
        //Asignamos los nombres
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        /*Incializamos puntuaciones y rondas
        this.puntosJ1 = puntosJ1;
        this.puntosJ2 = puntosJ2;
        this.rondasJ1 = rondasJ1;
        this.rondasJ2 = rondasJ2;*/
    }

    //Creamos el método Getter
    public String getJugador1(){
        return jugador1;
    }
    public  String getJugador2(){
        return jugador2;
    }
    

    //Función con las normas del juego y proporcionar ejemplos del funcionamiento
    public static void descripcion_juego(){
        System.out.println("-------------NORMAS DEL JUEGO-------------");
        System.out.println("""
                           * Cada ronda ambos jugadores lanzar\u00e1n dos dados de 6 caras.
                           * Si cualquier dado coincide entre los cuatro valores:
                                - Jugador 1 gana 1 punto
                            * Si no coincide ninguno:
                                - Jugador 2 gana 2 puntos
                            * Gana el jugador que logre 10 puntos o gane 5 rondas consecutivas

                            ----------------EJEMPLO---------------
                            J1 saca 3 y 5
                            J2 saca 5 y 2
                            -- Como coinciden en el 5 el jugador 1 se lleva un punto

                            J1 saca 1 y 4
                            J2 saca 2 y 6
                            -- Como no hay coincidencias jugador 2 se lleva dos puntos
                           """);

    }

    //Validamos la respuesta SI o NO
    public String validarRespuesta(String respuesta){
        while (true) { 
            respuesta = respuesta.trim().toUpperCase();
        
        
        if(respuesta.equals("SI") || respuesta.equals("NO")){
            return respuesta;
        } else{
            System.out.println("Respuesta no válida. Por favor escriba SI o NO");
            respuesta = sc.nextLine();

            }
        }
    }

    //Creamos el método principal del juego
    public void jugar(){
        System.out.println("---------COMIENZA LA PARTIDA------------");
        boolean partidaActiva = true;

        while(partidaActiva){
            //Lanzamos los dados
            int j1_d1 = random.nextInt(6)+1;
            int j1_d2 = random.nextInt(6)+1;
            int j2_d1 = random.nextInt(6)+1;
            int j2_d2 = random.nextInt(6)+1;

            //Mostramos los resultados
            System.out.println("Ronda: ");
            System.out.println(jugador1+ " ha sacado los números " +j1_d1+ " y " +j1_d2);
            System.out.println(jugador2+ " ha sacado los números " +j2_d1+ " y " +j2_d2);

            //Comprobamos si hay coincidencias

            boolean coincidencia = j1_d1 == j1_d2 || j2_d1 == j2_d2 ||
                j1_d1 == j2_d1 || j1_d1 == j2_d2 || j1_d2 == j2_d1 || j1_d2 == j2_d2;

            //Asigamos los puntos según resultados
            
            if(coincidencia){
                puntosJ1++;
                rondasJ1++;
                rondasJ2 = 0;
                System.out.println("¡Coincidencia! Punto para " +jugador1);
            } else{
                puntosJ2 += 2;
                rondasJ2++;
                rondasJ1 = 0;
                System.out.println("No hay coincidencias, punto para " +jugador2);
            }

            //Mostramos el marcador
            System.out.println("\n---------MARCADOR---------\n"
                +jugador1+ " ha ganado " +puntosJ1+ " puntos y ha ganado " +rondasJ1+" rondas\n"
                +jugador2+ " ha ganado " +puntosJ2+ " puntos y ha ganado " +rondasJ2+" rondas\n"

            );

            //Comprobamos si alguien ha ganado la partida
            if(puntosJ1>=PUNTOS_GANAR || rondasJ1>=RONDAS_GANAR){
                System.out.println("EL GANADOR ES " +jugador1);
                partidaActiva = false;
            }

            if(puntosJ2>=PUNTOS_GANAR || rondasJ2>=RONDAS_GANAR){
                System.out.println("EL GANADOR ES " +jugador2);
                partidaActiva = false;
            }
        }
    }



}

