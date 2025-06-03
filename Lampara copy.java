// package Ejercicios;

// interface Encendible {
//     boolean encendido = false;
//     void encender();
//     void apagar();
// }

// public class Lampara implements Encendible {
//     boolean encendido = false;

//     public void encender() {
//         encendido = true;
//         System.out.println("La lámpara ha sido encendida.");
//     }

//     public void apagar() {
//         encendido = false;
//         System.out.println("La lámpara ha sido apagada.");
//     }

//     public void iluminar() {
//         if (encendido) {
//             System.out.println("La lámpara está iluminando.");
//         } else {
//             System.out.println("La lámpara está apagada, no puede iluminar.");
//         }
//     }
// }


// public class Computadora implements Encendible {
//     boolean encendido = false;

//     public void encender() {
//         encendido = true;
//         System.out.println("La computadora ha sido encendida.");
//     }

//     public void apagar() {
//         encendido = false;
//         System.out.println("La computadora ha sido apagada.");
//     }
// }