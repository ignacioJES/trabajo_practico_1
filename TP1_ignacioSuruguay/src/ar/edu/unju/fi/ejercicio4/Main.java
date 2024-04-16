package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre 0 y 10
        System.out.print("Ingrese un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        // Verificar si el número está dentro del rango permitido
        if (numero < 0 || numero > 10) {
            System.out.println("El número debe estar entre 0 y 10.");
        } else {
            // Calcular el factorial utilizando un bucle while
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            // Mostrar el resultado por consola
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
