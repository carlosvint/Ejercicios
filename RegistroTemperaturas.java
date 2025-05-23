package Ejercicios;

import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] array_temperaturas = new double[7];
        String[] dias_semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double suma = 0;

        System.out.println("Bienvenido al registro de temperaturas");
        System.out.println("A continuacion introduce las temperaturas para los siguientes dias:");

        for (int i=0; i < dias_semana.length; i++){
            System.out.println("Introduce la temperatura para el " + dias_semana[i] + ": ");
            array_temperaturas[i] = scanner.nextDouble();
            suma += array_temperaturas[i];
        }

        double promedio = suma / dias_semana.length;
        System.out.println("La temperatura promedio de la semana es: " + promedio);

        for (int i=0; i < dias_semana.length; i++){
            if (array_temperaturas[i] > promedio){
                System.out.println("La temperatura del " + dias_semana[i] + " es mayor al promedio.");
            } else if (array_temperaturas[i] < promedio){
                System.out.println("La temperatura del " + dias_semana[i] + " es menor al promedio.");
            } else {
                System.out.println("La temperatura del " + dias_semana[i] + " es igual al promedio.");
            }
        }
    }
}
