package Ejercicios;

import  java.time.LocalDate;
import  java.time.LocalTime;  
import  java.time.Duration;


public class Main {
    public static void main(String[] args){
        // Crear un objeto de la clase Eventos
        Eventos evento = new Eventos("Concierto", LocalDate.of(2025, 05, 22), LocalTime.of(22, 0), LocalTime.of(23, 0));

        // Mostrar información del evento
        evento.mostrarInformacion();

        // Calcular y mostrar la duración del evento
        Duration duracion = evento.calcularDuracion();
        System.out.println("Duración del evento: " + duracion.toHours() + " horas");

        // Verificar si el evento es hoy
        if (evento.esHoy()) {
            System.out.println("El evento es hoy.");
        } else if (evento.yaPaso()) {
            System.out.println("El evento ya pasó.");
        } else {
            System.out.println("El evento es en el futuro.");
        }

        // Crear notificación
        evento.crearNotificacion();
    }
}