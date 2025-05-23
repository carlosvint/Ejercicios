package Ejercicios;

import java.util.Scanner;

public class Factorial {
    //Factorial de un numero se define como el producto de todos los numeros enteros positivos menores o iguales a n
    //El factorial de n se escribe como n!
    //Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120
    //El factorial de 0 es 1

    // El programa recibe un numero y calcula su factorial

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Validar que el numero sea mayor o igual a 0
        if (numero < 0){
            System.out.println("El factorial no esta definido para numeros negativos");}
        else {
            int factorial = 1;
            for (int i=1; i<=numero; i++){
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        // Si el numero es menor a 0, mostrar un mensaje de error
        
    }     

}
