package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Pizza pizza = new Pizza();

            System.out.println("** Pizza " + (i + 1) + " **");

            System.out.print("Diámetro (20, 30 o 40): ");
            int diametro = scanner.nextInt();

            System.out.print("Ingredientes especiales (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();

            pizza.setDiametro(diametro);
            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            pizza.calcularPrecio();
            pizza.calcularArea();

            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }

        scanner.close();
    }
}
