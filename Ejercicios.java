package Ejercicios;

public class Ejercicios {

    //ARRAY
    public static int[] array = new int[10];
    public static String[] arrayString = new String[5];


    //BUCLE FOR

    public static void llenarArray(){
        for (int i=0; i < array.length; i++){
            //System.out.println(i);
        }
    }

    // if / if else
    public static void llenarArrayString(){
        for (int i = 0; i < arrayString.length; i++){
            if (i % 2 != 0){
                arrayString[i] = "Par";
            } else {
                arrayString[i] = "Impar";
            }
        }
    }

    public static void main(String[] args){
        llenarArray();
        llenarArrayString();
        for (int i=0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
    }
}


//ARRAY
