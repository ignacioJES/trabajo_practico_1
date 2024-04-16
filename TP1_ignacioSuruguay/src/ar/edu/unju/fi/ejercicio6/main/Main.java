package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("12345678A", "Juan", LocalDate.of(1990, 5, 15), "Madrid");

        // Mostrar los datos de la persona
        persona.mostrarDatos();
    }
}
