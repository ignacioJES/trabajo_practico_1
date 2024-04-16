package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);

        int sumatoria = calculadora.calcularSumatoria();
        int productoria = calculadora.calcularProductoria();

        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("La productoria es: " + productoria);

        scanner.close();
    }
}
