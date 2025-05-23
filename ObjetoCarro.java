package Ejercicios;

public class ObjetoCarro {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String numeroChasis;
    private boolean Encendido = false;  
    private int caballos;
    private double combustible;
    private double consumocombustiblepromedio;
    private double velocidadMaxima;
    private double velocidadActual;
    private boolean direccion = true;
    private double posicion[] = new double[2]; // [x, y]


    // Constructor
    public ObjetoCarro(String marca, String modelo, int anio, String color, String numeroChasis, int caballos, double combustible,
            double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.numeroChasis = numeroChasis;
        this.caballos = caballos;
        this.combustible = combustible;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    // Metodos
    public void encender() {
        if (!Encendido & combustible > 0)  {
            Encendido = true;
            System.out.println("El carro ha sido encendido.");
        } else {
            System.out.println("El carro ya está encendido.");
        }
    }

    public void apagar(){
        if (Encendido) {
            Encendido = false;
            System.out.println("El carro ha sido apagado.");
        } else {
            System.out.println("El carro ya está apagado.");
        }
    }

    public void acelerar(double incremento){
        if (Encendido) {
            if (combustible > 0) {
                if (velocidadActual + incremento <= velocidadMaxima) {
                    combustible -= (incremento / 100) * consumocombustiblepromedio;
                    velocidadActual += incremento;
                    System.out.println("El carro ha acelerado a " + velocidadActual + " km/h.");
                } else {
                    System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velocidadMaxima + " km/h.");
                    velocidadActual = velocidadMaxima;
            }
            } else {
                System.out.println("No hay suficiente combustible para acelerar.");
                return;
            }
        }else {
            System.out.println("El carro está apagado. No se puede acelerar.");
        }
    }

    public void frenar(double decremento){
        if (Encendido){
            if (velocidadActual - decremento >= 0){
                velocidadActual -= decremento;
                System.out.println("El carro ha frenado a " + velocidadActual + " km/h.");
            } else {
                System.out.println("No se puede frenar más allá de 0 km/h.");
                velocidadActual = 0;
            }
        }
    }

    public void cargarCombustible(double cantidad){
        if (cantidad > 0) {
            combustible += cantidad;
            System.out.println("Se ha cargado " + cantidad + " litros de combustible.");
        } else {
            System.out.println("Cantidad de combustible no válida.");
        }
    }

    //Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }
;}

