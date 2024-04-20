package ar.edu.unju.fi.ejercicio17.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.Model.Jugador;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores de una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Alta de jugador
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el apellido del jugador: ");
                    String apellido = scanner.next();
                    // Aquí puedes solicitar al usuario que ingrese los demás datos del jugador
                    Jugador nuevoJugador = new Jugador(nombre, apellido, "", "", 0.0, 0.0, "");
                    jugadores.add(nuevoJugador);
                    break;
                case 2:
                    // Mostrar los datos del jugador
                    System.out.print("Ingrese el apellido del jugador a mostrar: ");
                    String apellidoBuscar = scanner.next();
                    for (Jugador jugador : jugadores) {
                        if (jugador.getApellido().equals(apellidoBuscar)) {
                            // Aquí puedes mostrar los datos del jugador encontrado
                            System.out.println("Datos del jugador:");
                            System.out.println("Nombre: " + jugador.getNombre());
                            System.out.println("Apellido: " + jugador.getApellido());
                            // Mostrar los demás datos del jugador
                            break;
                        }
                    }
                    break;
                case 3:
                    // Mostrar todos los jugadores ordenados por apellido
                    Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareTo(j2.getApellido()));
                    for (Jugador jugador : jugadores) {
                        // Aquí puedes mostrar la lista de jugadores ordenada por apellido
                        System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
                    }
                    break;
                case 4:
                    // Modificar los datos de un jugador
                    System.out.print("Ingrese el apellido del jugador a modificar: ");
                    String apellidoModificar = scanner.next();
                    for (Jugador jugador : jugadores) {
                        if (jugador.getApellido().equals(apellidoModificar)) {
                            // Aquí puedes permitir al usuario modificar los datos del jugador encontrado
                            // Por ejemplo, solicitar nuevos valores y actualizar el objeto Jugador
                            break;
                        }
                    }
                    break;
                case 5:
                    // Eliminar un jugador
                    System.out.print("Ingrese el apellido del jugador a eliminar: ");
                    String apellidoEliminar = scanner.next();
                    for (Jugador jugador : jugadores) {
                        if (jugador.getApellido().equals(apellidoEliminar)) {
                            jugadores.remove(jugador);
                            break;
                        }
                    }
                    break;
                case 6:
                    // Mostrar la cantidad total de jugadores
                    System.out.println("La cantidad total de jugadores es: " + jugadores.size());
                    break;
                case 7:
                    // Mostrar la cantidad de jugadores de una nacionalidad
                    System.out.print("Ingrese la nacionalidad a buscar: ");
                    String nacionalidadBuscar = scanner.next();
                    int cantidadNacionalidad = 0;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNacionalidad().equals(nacionalidadBuscar)) {
                            cantidadNacionalidad++;
                        }
                    }
                    System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidadBuscar + " es: " + cantidadNacionalidad);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingrese una opción válida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}