package Ejercicios;

public class Combinaciones {
    // Combinaciones de 3 elementos tomados de 5
    public static void main(String[] args) {
        int n = 5; // Total de elementos
        int r = 3; // Elementos a tomar
        int combinaciones = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Combinaciones de " + n + " tomados de " + r + ": " + combinaciones);
    }
}


