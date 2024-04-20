package ar.edu.unju.fi.ejercicio18.Main;

import ar.edu.unju.fi.ejercicio18.Model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.Model1.Pais;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pais> paises = new ArrayList<>();
    private static ArrayList<DestinoTuristico> destinos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        precargarPaises();

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero();

            try {
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico();
                        break;
                    case 2:
                        mostrarDestinosTuristicos();
                        break;
                    case 3:
                        modificarPaisDestinoTuristico();
                        break;
                    case 4:
                        limpiarDestinosTuristicos();
                        break;
                    case 5:
                        eliminarDestinoTuristico();
                        break;
                    case 6:
                        mostrarDestinosOrdenadosPorNombre();
                        break;
                    case 7:
                        mostrarTodosLosPaises();
                        break;
                    case 8:
                        mostrarDestinosPorPais();
                        break;
                    case 9:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void precargarPaises() {
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1 - Alta de destino turístico");
        System.out.println("2 - Mostrar todos los destinos turísticos");
        System.out.println("3 - Modificar el país de un destino turístico");
        System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
        System.out.println("5 - Eliminar un destino turístico");
        System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
        System.out.println("7 - Mostrar todos los países");
        System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
        System.out.println("9 - Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static int leerEntero() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Error: Por favor, ingrese un número válido.");
        } finally {
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    private static void altaDestinoTuristico() {
        System.out.println("\n===== ALTA DE DESTINO TURÍSTICO =====");
        System.out.print("Ingrese el código del destino: ");
        int codigo = leerEntero();

        System.out.print("Ingrese el nombre del destino: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del destino: ");
        double precio = scanner.nextDouble();

        System.out.println("Lista de países:");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }
        System.out.print("Ingrese el código del país: ");
        int codigoPais = leerEntero();

        Pais pais = buscarPaisPorCodigo(codigoPais);
        if (pais == null) {
            System.out.println("Error: País no encontrado.");
            return;
        }

        System.out.print("Ingrese la cantidad de días: ");
        int cantidadDias = leerEntero();

        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
        destinos.add(destino);
        System.out.println("Destino turístico agregado con éxito.");
    }

    private static void mostrarDestinosTuristicos() {
        System.out.println("\n===== DESTINOS TURÍSTICOS =====");
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        for (DestinoTuristico destino : destinos) {
            System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
        }
    }

    private static void modificarPaisDestinoTuristico() {
        System.out.println("\n===== MODIFICAR PAÍS DE UN DESTINO TURÍSTICO =====");
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para modificar.");
            return;
        }

        System.out.print("Ingrese el código del destino turístico a modificar: ");
        int codigoDestino = leerEntero();

        DestinoTuristico destino = buscarDestinoPorCodigo(codigoDestino);
        if (destino == null) {
            System.out.println("Error: Destino turístico no encontrado.");
            return;
        }

        System.out.println("Lista de países:");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }
        System.out.print("Ingrese el nuevo código de país: ");
        int nuevoCodigoPais = leerEntero();

        Pais nuevoPais = buscarPaisPorCodigo(nuevoCodigoPais);
        if (nuevoPais == null) {
            System.out.println("Error: País no encontrado.");
            return;
        }

        destino.setPais(nuevoPais);
        System.out.println("País modificado con éxito.");
    }

    private static void limpiarDestinosTuristicos() {
        destinos.clear();
        System.out.println("Lista de destinos turísticos limpiada.");
    }

    private static void eliminarDestinoTuristico() {
        System.out.print("Ingrese el código del destino turístico a eliminar: ");
        int codigoDestino = leerEntero();

        for (int i = 0; i < destinos.size(); i++) {
            DestinoTuristico destino = destinos.get(i);
            if (destino.getCodigo() == codigoDestino) {
                destinos.remove(i);
                System.out.println("Destino turístico eliminado con éxito.");
                return;
            }
        }
        System.out.println("Error: Destino turístico no encontrado.");
    }

    private static void mostrarDestinosOrdenadosPorNombre() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
        destinosOrdenados.sort((d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

        System.out.println("\n===== DESTINOS TURÍSTICOS ORDENADOS POR NOMBRE =====");
        for (DestinoTuristico destino : destinosOrdenados) {
            System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
        }
    }

    private static void mostrarTodosLosPaises() {
        System.out.println("\n===== LISTA DE PAÍSES =====");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }
    }

    private static void mostrarDestinosPorPais() {
        System.out.print("Ingrese el código del país: ");
        int codigoPais = leerEntero();

        Pais pais = buscarPaisPorCodigo(codigoPais);
        if (pais == null) {
            System.out.println("Error: País no encontrado.");
            return;
        }

        System.out.println("\n===== DESTINOS TURÍSTICOS EN " + pais.getNombre().toUpperCase() + " =====");
        boolean encontrado = false;
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().equals(pais)) {
                System.out.println(destino.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay destinos turísticos para mostrar en " + pais.getNombre() + ".");
        }
    }

    private static Pais buscarPaisPorCodigo(int codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigo) {
                return pais;
            }
        }
        return null;
    }

    private static DestinoTuristico buscarDestinoPorCodigo(int codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigo) {
                return destino;
            }
        }
        return null;
    }
}
