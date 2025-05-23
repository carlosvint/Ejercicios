package Ejercicios;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String numeroChasis;
    private double kilometraje;
    private String placa;
    private boolean esAutomatico;
    private double combustible;
    private double velocidadMaxima;
    private double velocidadActual;
    private double consumocombustible;
    private boolean encendido = false;

    // Setters
    public void setCombustible(double combustible) {
        if (combustible < 0) {
            this.combustible = 0;
        } else if (combustible > 100) {
            this.combustible = 100;
        } else {
            this.combustible = combustible;
        }
    }

    // Constructor
    public Auto(String marca, String modelo, int anio, String color, String numeroChasis, double kilometraje,
            String placa, boolean esAutomatico, double combustible, double velocidadMaxima, double consumocombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.numeroChasis = numeroChasis;
        this.kilometraje = kilometraje;
        this.placa = placa;
        this.esAutomatico = esAutomatico;
        this.combustible = combustible;
        this.setCombustible(combustible);
        this.velocidadMaxima = velocidadMaxima;
        this.consumocombustible = consumocombustible;
        this.velocidadActual = 0;
    }

    // Métodos

    public void encender(){
        if (!encendido && combustible > 0)  {
            encendido = true;
            System.out.println("El auto ha sido encendido.");
        } else {
            if (encendido) {
                System.out.println("El auto ya está encendido.");
            } else {
                System.out.println("No hay combustible suficiente para encender el auto.");
            }
        }
    }

    public void apagar(){
        if (encendido) {
            encendido = false;
            System.out.println("El auto ha sido apagado.");
        } else {
            System.out.println("El auto ya está apagado.");
        }
    }

    public void acelerar(double incremento){
        if (encendido){
            if (combustible > 0) {
                if (velocidadActual + incremento <= velocidadMaxima) {
                    combustible -= consumocombustible * (incremento / 100);
                    velocidadActual += incremento;
                    System.out.println("El auto ha acelerado a " + velocidadActual + " km/h.");
                } else {
                    System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velocidadMaxima + " km/h.");
                    velocidadActual = velocidadMaxima;
                }
            } else {
                System.out.println("No hay suficiente combustible para acelerar.");
            }
        } else {
            System.out.println("El auto está apagado. Enciéndelo primero.");
        }
    }

    public void frenar(double decremento){
        if (encendido){
            if (velocidadActual - decremento >= 0){
                velocidadActual -= decremento;
                System.out.println("El auto ha frenado a " + velocidadActual + " km/h.");
            } else {
                System.out.println("No se puede frenar más allá de 0 km/h.");
                velocidadActual = 0;
            }
        } else {
            System.out.println("El auto está apagado. Enciéndelo primero.");
        }
    }

    public void cargarCombustible(double cantidad){
        if (cantidad > 0 && (combustible + cantidad) <= 100) {
            combustible += cantidad;
            System.out.println("Se ha cargado " + cantidad + " litros de combustible.");
        } else {
            if (cantidad <= 0) {
                System.out.println("La cantidad de combustible a cargar debe ser positiva.");
            } else {
                System.out.println("No se puede cargar más de 100 litros de combustible.");
            }
        }
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
    


}
