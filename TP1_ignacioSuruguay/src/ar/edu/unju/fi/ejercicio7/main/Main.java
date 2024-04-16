package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, legajo, salario);

        System.out.println("Datos del empleado:");
        empleado.mostrarDatos();

        empleado.darAumento();

        System.out.println("\nDespués del aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
}
