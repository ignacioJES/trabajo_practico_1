package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número ingresado es par o impar
        if (numero % 2 == 0) {
            // El número es par, mostrar el triple del número
            int triple = numero * 3;
            System.out.println("El número ingresado es par. El triple es: " + triple);
        } else {
            // El número es impar, mostrar el doble del número
            int doble = numero * 2;
            System.out.println("El número ingresado es impar. El doble es: " + doble);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
