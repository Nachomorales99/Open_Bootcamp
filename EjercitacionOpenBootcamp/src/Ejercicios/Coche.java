package Ejercicios;

public class Coche {

    public int doors = 4;

    public void increment() {
        doors++;
    }

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.increment();
        miCoche.increment();
        System.out.println("Numero de puertas del coche: " + miCoche.doors);

    }
}

/*

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.

 */