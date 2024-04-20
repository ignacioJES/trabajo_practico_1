package ar.edu.unju.fi.ejercicio14.Main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero en el rango [3,10]: ");
        int tamañoArray = scanner.nextInt();

        if (tamañoArray < 3 || tamañoArray > 10) {
            System.out.println("El número ingresado está fuera del rango. El programa finalizará.");
            extracted();
        }

        int[] numeros = new int[tamañoArray];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores ingresados:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
    }

	private static void extracted() {
	}
}
