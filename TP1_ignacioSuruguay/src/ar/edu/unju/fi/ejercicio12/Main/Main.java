package ar.edu.unju.fi.ejercicio12.Main;

import ar.edu.unju.fi.ejercicio12.Model.Persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (formato dd/MM/yyyy): ");
            String fechaNacimientoStr = scanner.nextLine();

            Calendar fechaNacimiento = new GregorianCalendar();
            try {
                fechaNacimiento.setTime(sdf.parse(fechaNacimientoStr));
            } catch (Exception e) {
                System.out.println("Formato de fecha incorrecto. El programa finalizará.");
                return;
            }

            Persona persona = new Persona(nombre, fechaNacimiento);
            System.out.println("\nDatos de la persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Fecha de nacimiento: " + sdf.format(persona.getFechaNacimiento().getTime()));
            System.out.println("Edad: " + persona.calcularEdad() + " años");
            System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
            System.out.println("Estación: " + persona.determinarEstacion());
        } finally {
            // Cerrar el objeto Scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
