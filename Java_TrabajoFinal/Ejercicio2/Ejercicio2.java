

public class Ejercicio2 {
    public static void main(String[] args) {

        //Creamos el array de Alumnos y de notas
        String[] alumnos = {"Francisco", "Lucía", "Juan", "Paula", "Alba"};

        //Cada fila es un alumno y cada columna las asignaturas HTML, CSS, JS y BD
        int [][] notas = {
            {9,4,8,3},
            {7,8,10,5},
            {10,8,6,8},
            {7,4,8,4},
            {8,5,6,5}
        };

        //LLamamos a todas las funciones para que muestre los resultados por pantalla
        suspensosAsignatura(notas);
        notaMedia(alumnos, notas);
        mediaSuspensos(notas);
        alumnoAprobado(alumnos, notas);
    }

    //Función para calcular cuantos alumnos han suspendido cada asignatura
    public static void suspensosAsignatura(int[][] notas){

        //Contador de suspensos por cada asignatura
        int suspensosHTML= 0;
        int suspensosCSS= 0;
        int suspensosJS= 0;
        int suspensosBD= 0;

        //Recorremos cada alumno y su nota
        for(int[] alumno : notas){
            //Comprobamos cada asignatura
            if(alumno[0] < 5) suspensosHTML++;
            if(alumno[1] < 5) suspensosCSS++;
            if(alumno[2] < 5) suspensosJS++;
            if(alumno[3] < 5) suspensosBD++;

        }

        //Mostramos los resultados
        System.out.println("Suspensos por cada asignatura:");
        System.out.println("La asignatura HTML ha sido suspendida por " +suspensosHTML+ " alumnos");
        System.out.println("La asignatura CSS ha sido suspendida por " +suspensosCSS+ " alumnos");
        System.out.println("La asignatura JavaScript ha sido suspendida por " +suspensosJS+ " alumnos");
        System.out.println("La asignatura Bases de datos ha sido suspendida por " +suspensosBD+ " alumnos");
    }

    //Función para calcular la media de cada alumno
    public static void notaMedia(String[] alumnnos, int[][] notas){

        System.out.println("Nota media de cada alumno");

        //Recorremos cada fila de cada alumno
        for(int i= 0; i<notas.length;i++){
            //Calculamos la media
            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3])/4.0;

            //Mostramos resultado por pantalla
            System.out.println("El alumno " + alumnnos[i]+ " ha obtenido una nota media de " +media);
        }

    }

    //Función para calcular la media de suspensos entre todos los alumnos
    public static void mediaSuspensos(int[][] notas){
        //Creamos el contador
        int totalSuspensos= 0;

        //Recorremos el array
        for(int[] alumnos: notas){
            if(alumnos[0] < 5) totalSuspensos++;
            if(alumnos[1] < 5) totalSuspensos++;
            if(alumnos[2] < 5) totalSuspensos++;
            if(alumnos[3] < 5) totalSuspensos++;
        }
        //Calculamos la media dividiendo por la cantidad de alumnos
        double media = totalSuspensos / (double) notas.length;

        //Mostramos por pantalla el resultado
        System.out.println("La media de suspensos por alumnos es " + String.format("%.2f", media));

    }

    //Función para mostrar los nombres de los alumnos que han aprobado el curso
    public static void alumnoAprobado(String[] alumnos, int[][] notas){

        System.out.println("Alumnos que aprueban el curso:");

        //String para almacenar los alumnos aprobados
        String aprobados= "";
        boolean hayAprobados = false;

        //Recorremos cada alumno y sus notas
        for(int i= 0; i<notas.length;i++){

            //Comprobamos si hay alguna asignatura suspendida
            boolean suspende= notas[i][0] < 5 || notas[i][1] <5 || notas[i][2] < 5 || notas[i][3] < 5;

            //Calculamos la media
            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4.0;

            //Solo se aprueba si no suspende y su media es mayor o igual que 5
            if(!suspende && media >= 5){
                aprobados += alumnos[i] + ", ";
                hayAprobados = true;
            }
        }

        //Mostramos resultado por pantalla
        if(hayAprobados){
            System.out.println("Los alumnos que han aprobado son: " +aprobados.substring(0, aprobados.length() -2));
        }else{
            System.out.println("Ningún alumno ha aprobado el curso");
        }

    }


}
