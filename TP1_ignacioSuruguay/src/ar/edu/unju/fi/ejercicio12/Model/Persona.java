package ar.edu.unju.fi.ejercicio12.Model;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar fechaActual = new GregorianCalendar();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String determinarSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Se suma 1 porque en Calendar los meses van de 0 a 11

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Se suma 1 porque en Calendar los meses van de 0 a 11

        if (mes == 1 || mes == 2 || mes == 3) {
            return "Verano";
        } else if (mes == 4 || mes == 5 || mes == 6) {
            return "Otoño";
        } else if (mes == 7 || mes == 8 || mes == 9) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }
}
