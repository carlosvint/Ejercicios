package Ejercicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;



public class Eventos {
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    // Constructor

    public Eventos(String nombre, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Methods

    public void mostrarInformacion() {
        System.out.println("Nombre del evento: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de fin: " + horaFin);
    }

    public Duration calcularDuracion() {
        return Duration.between(horaInicio, horaFin);
    }

    public boolean esHoy(){
        return fecha.isEqual(LocalDate.now());
    }

    public boolean yaPaso(){
        return fecha.isBefore(LocalDate.now());
    }

    public void crearNotificacion(){
        while (esHoy()){
            System.out.println("El evento " + nombre + " es hoy.");
            try {
                Thread.sleep(1000); // Espera 1 segundo antes de volver a verificar
            } catch (InterruptedException e) {
                System.out.println("Error en la notificación: " + e.getMessage());
            }
            if (yaPaso()){
                System.out.println("El evento " + nombre + " ya pasó.");
                break;
            }
        }
    }
}
