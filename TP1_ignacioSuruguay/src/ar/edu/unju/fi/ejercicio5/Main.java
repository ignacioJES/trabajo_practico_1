package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre 1 y 9
        System.out.print("Ingrese un número entre 1 y 9: ");
        int numero = scanner.nextInt();

        // Verificar si el número está dentro del rango permitido
        if (numero < 1 || numero > 9) {
            System.out.println("El número debe estar entre 1 y 9.");
        } else {
            // Mostrar la tabla de multiplicar utilizando un bucle for
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
