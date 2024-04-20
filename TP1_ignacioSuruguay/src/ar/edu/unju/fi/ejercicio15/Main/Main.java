package ar.edu.unju.fi.ejercicio15.Main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero en el rango [5,10]: ");
            int tamañoArray = scanner.nextInt();

            if (tamañoArray < 5 || tamañoArray > 10) {
                throw new IllegalArgumentException("El número ingresado está fuera del rango [5,10].");
            }

            String[] nombres = new String[tamañoArray];

            for (int i = 0; i < nombres.length; i++) {
                System.out.print("Ingrese un nombre de persona para la posición " + i + ": ");
                nombres[i] = scanner.next();
            }

            System.out.println("\nValores ingresados:");

            // Mostrar valores en orden ascendente
            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Posición " + i + ": " + nombres[i]);
            }

            System.out.println("\nValores ingresados en orden inverso:");

            // Mostrar valores en orden inverso
            for (int i = nombres.length - 1; i >= 0; i--) {
                System.out.println("Posición " + i + ": " + nombres[i]);
            }
        } finally {
            // Cerrar el objeto Scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
