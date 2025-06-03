package Ejercicios;

interface Encendible {
    boolean encendido = false;
    void encender();
    void apagar();
}

public class Lampara implements Encendible{

    boolean encendido = false;

    public void iluminar(){}

    public void encender() {
        System.out.println("La lámpara ha sido encendida.");
    }

    public void apagar() {
        System.out.println("La lámpara ha sido apagada.");
    }
}

public class Computadora implements Encendible {
    public void encender() {
        System.out.println("La computadora ha sido encendida.");
    }

    public void apagar() {
        System.out.println("La computadora ha sido apagada.");
    }
}

// public class Televisor implements Encendible {

//     public void encender() {
//         System.out.println("El televisor ha sido encendido.");
//     }

//     public void apagar() {
//         System.out.println("El televisor ha sido apagado.");
//     }
// }