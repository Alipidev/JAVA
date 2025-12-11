package Ejercicio5;
/* Crea un programa que simule una partida de dados entre dos amigos. Las nor-
mas del juego son:
n El juego o partida, se dividirá en rondas.
n En cada ronda, los jugadores lanzarán dos datos de 6 simultáneamente
y se apuntarán los resultados obtenidos.
n La puntuación de la ronda dependerá de los valores obtenidos por los
jugadores:
o El Jugador 1 obtendrá 1 punto, si alguno de los valores obtenidos
al lanzar los datos coincide, ya sea entre los lanzados por el Juga-
dor1, por el Jugador 2 o entre ambos.
o El Jugador 2 obtendrá 2 puntos si ninguno de los valores obtenidos
al lanzar los dados coincide, ya sea entre los lanzados por el Juga-
dor1, por el jugador2 o entre ambos.
n Al finalizar cada ronda se deberá mostrar el marcador de las puntuacio-
nes.
n Se considerará ganador del juego a aquel jugador que cumpla primero
con alguna de las siguientes condiciones:
o Ganar 5 rondas seguidas
o Obtener un total de 10 puntos
n Cuando se determine el ganador del juego, será obligatorio mostrar el
resultado de la partida y enviar un mensaje de felicitación al ganador. En
este momento, la partida finalizará. */
import java.util.Random;
import java.util.Scanner;

public class Mi_Partida {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("SIMULADOR DE PARTIDA DE DADOS");

        boolean continuar = true;

        while(continuar){
            Juego_Dados dummy = new Juego_Dados("", "");
            dummy.descripcion_juego();

            //Preguntamos si quieren jugar
            System.out.println("¿Desea jugar una partida? SI o NO");
            String respuesta = dummy.validarRespuesta(sc.nextLine());

            if(respuesta.equals("NO")){
                System.out.println("Gracias por jugar. Hasta pronto");
                break;
            }

            //Introducimos los nombres
            System.out.println("Por favor introduzcan sus nombres de usuario");
            String nombre1 = obtener_datos();
            String nombre2 = obtener_datos();

            //Asignamos los jugadores aleatoriamente
            String[] asignados = asignacion_y_bienvenida(nombre1, nombre2);

            //Creamos la partida
            Juego_Dados juego = new Juego_Dados(asignados[0], asignados[1]);

            //Jugamos
            juego.jugar();

            //Preguntar si desean volver a jugar
            System.out.println("¿Desean jugar otra partida? SI o NO");
            respuesta = juego.validarRespuesta(sc.nextLine());

            if(respuesta.equals("NO")){
                System.out.println("Gracias por jugar. Hasta pronto");
                continuar = false;
            }
            
        }
        
    }

    //Función para obtener el nombre de los usuarios que van a jugar
    public static String obtener_datos(){

        while (true) { 
            System.out.println("Introduce el nombre del jugador: ");
            String nombre = sc.nextLine().trim();

            //Reeglas de validación
            if(nombre.isEmpty()){
                System.out.println("El nombre no puede estar vacío");
                continue;
            }
            if(nombre.length()<2 || nombre.length()>10){
                System.out.println("El nombre debe tener entre 2 y 10 caracteres");
                continue;
            }
            if(!Character.isLetter(nombre.charAt(0))){
                System.out.println("El nombre debe comenzar por una letra");
                continue;
            }
            //Nombre válido
            return nombre;
        }

    }

    //Función para asignar a los usuarios el jugador de forma aleatoria
    public static String[] asignacion_y_bienvenida(String n1, String n2){

        Random r = new Random();
        String jugador1, jugador2;

        //Decide al azar que jugador será el jugador1
        if(r.nextBoolean()){
            jugador1 = n1;
            jugador2 = n2;
        } else{
            jugador1 = n2;
            jugador2 = n1;
        }

        //Mostramos por pantalla cual será el jugador 1 y el jugador 2
        System.out.println("Bienvenidos " +jugador1+ " y " +jugador2);
        System.out.println("El jugador 1 será " +jugador1);
        System.out.println("EL jugador 2 será " +jugador2);

        return new String[]{jugador1,jugador2};
        
    }
}
