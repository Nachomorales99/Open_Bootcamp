package Ejercicios;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros enteros para sumarlos");
        int a,b,c;

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        System.out.println(a + " + " + b + " + " + c + " = " + suma(a,b,c));
    }

    public static int suma (int a, int b, int c) {

        return a + b + c;
    }
}


/*
Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

 */