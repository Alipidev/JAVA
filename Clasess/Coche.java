package Clasess;

//Que herede de vehiculos pero tiene datos propios


public class Coche{
    //Atributos o propiedades de nuestra clase
    //atributo FINAL no puede cambiar de valor
    private final int NUMRUEDAS=4;
    private String marca;
    private String color;
    private int numPuertas;
    private double maxVelocidad;

    //Método constructor, nos va a permitir crear objetos en esta clase
    public Coche(){//Se crea siempre aunque no lo escribas tu

    }

    public Coche(String m,String c){
        this.marca=m;
        this.color=c;
        
    }

    public Coche(String m, String c, int n, double vel){
        this.marca=m;
        this.color=c;
        this.numPuertas=n;
       this.maxVelocidad=vel;
    }

    //SETTER Y GETTERS
    //Setter establece valores y getter obtiene los valores

    //Metodos Setter por cada variable
    public void setMarca(String nombreMarca){
        this.marca = nombreMarca;
    }

    public void setColor(String nombreColor){
        this.color = nombreColor;
    }

    public void setNumPuertas(int numeroPuertas){
        this.numPuertas = numeroPuertas;
    }

    public void setmaxVelocidad(double maxVel){
        this.maxVelocidad = maxVel;
    }

    //Métodos Getter MINUTO 39 CLASE 2 CLASES
    //Método getter obtiene los valores o constantes
    public String getMarca(){
        return marca;
    }

    public String getColor(){
        return color;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

    public double getMaxVel(){
        return maxVelocidad;
    }

    //Definir comportamientos de la clase
    //Metodos o funciones
    public void description(){
        System.out.println("Los datos del vehiculo son: " + marca
        + "\n Color:" + color
        + "\n Número de ruedas" +NUMRUEDAS
        + "\n Número Puertas: " + numPuertas
        +"\n Velocidad maxima" +maxVelocidad);
    }

    //Metodo to string
    public String toString(){
        return "Los datos del vehiculo son: " + marca
        + "\n Color:" + color
        + "\n Número de ruedas" +NUMRUEDAS
        + "\n Número Puertas: " + numPuertas
        +"\n Velocidad maxima" +maxVelocidad;
    }


    
}
