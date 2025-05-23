package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoRandom{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intentos = 0;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }
}