package Ejercicios;

import java.util.*;

public class SentenciasDeControl {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int numeroIf = read.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El nuemero es 0");
        } else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }

        //////////////////////////////////////////////////////////////////////////

        System.out.println("Ingrese un numero entero menor a 3");

        int numeroWhile = read.nextInt();

        while (numeroWhile < 3) {
            System.out.println("While: " + numeroWhile);
            numeroWhile++;
        }

        //////////////////////////////////////////////////////////////////////////

        do {
            System.out.println("Do While: " + numeroWhile);
            numeroWhile++;

        } while (numeroWhile == 3);

        //////////////////////////////////////////////////////////////////////////

        for (int numeroFor = 0; 3 >= numeroFor; numeroFor++){
            System.out.println("For: " + numeroFor);
        }

        //////////////////////////////////////////////////////////////////////////

        System.out.println("Elija una de la siguientes opciones: \n" +
                "Menu \n" +
                "1: Verano \n" +
                "2: Otoño \n" +
                "3: Invierno \n" +
                "4: Primavera");

        int estacion = read.nextInt();

        switch (estacion) {
            case 1:
                System.out.println("Se eligio verano");
                break;
            case 2:
                System.out.println("Se eligio otoño");
                break;
            case 3:
                System.out.println("Se eligio invierno");
                break;
            case 4:
                System.out.println("Se eligio primavera");
                break;
            default:
                System.out.println("No se ingreso una opcion valida");
        }
    }
}

/*

- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
 el bloque de código que tendrá el bucle deberá:

    Incrementar el valor de la variable en uno cada vez que se ejecute.

    Mostrarlo por pantalla cada vez que se ejecute.

- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
 sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

- Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la variable no sea una estación.

 */
