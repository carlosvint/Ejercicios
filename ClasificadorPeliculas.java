package Ejercicios;

import java.util.Scanner;

public class ClasificadorPeliculas {
    /*
     VAMOS A HACER UN CLASIFICADOR DE PELICULAS
     - A -> TODO PUBLICO
     - B -> MAYORES DE 12 AÑOS
     - C -> SOLO PARA ADULTOS
     */

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido al clasificador de peliculas");
        System.out.println("Introduce la edad del espectador: ");
        int edad = scanner.nextInt();

        if (edad < 0){
            System.out.println("Edad no valida");
        } else if (edad < 12){
            System.out.println("Clasificacion A");
        } else if (edad < 18){
            System.out.println("Clasificacion B");
        } else {
            System.out.println("Clasificacion C");
        }
    }
}
