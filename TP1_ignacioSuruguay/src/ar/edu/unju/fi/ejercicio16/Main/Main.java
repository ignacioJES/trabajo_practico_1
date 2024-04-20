package ar.edu.unju.fi.ejercicio16.Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        // Pedir al usuario que ingrese los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los nombres ingresados usando un bucle while
        System.out.println("\nNombres ingresados:");
        int contador = 0;
        while (contador < nombres.length) {
            System.out.println(nombres[contador]);
            contador++;
        }

        // Mostrar el tamaño del array
        System.out.println("\nTamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese el índice a eliminar
        byte indiceEliminar;
        do {
            System.out.print("Ingrese el índice del nombre a eliminar (entre 0 y " + (nombres.length - 1) + "): ");
            indiceEliminar = scanner.nextByte();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

        // Eliminar el elemento del array
        for (int i = indiceEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = "";

        // Mostrar el array actualizado
        System.out.println("\nArray después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}
