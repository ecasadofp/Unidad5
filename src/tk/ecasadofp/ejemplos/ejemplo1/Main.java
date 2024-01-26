/*
Realiza un programa, con una interfaz gráfica sencilla, en el que nos pida una cantidad de días y
nos diga que fecha será cuando hayan pasado esos días a partir de hoy.
Mejóralo pidiendo al usuario si se trata de días, horas, semanas ...
*/

package tk.ecasadofp.ejemplos.ejemplo1;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
/*
    En este bloque vemos como se puede utilizar un formatter para traernos una fecha
    con formato

        String fechaString = "22/4/2024";
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("d/M/u");

        LocalDate fecha = LocalDate.parse(fechaString, formateadorFecha);

        System.out.println(fecha);
*/


        Object[] opciones = {"Meses", "Semanas", "Dias","Horas", "Minutos"};


        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime despues;

        int opcion = JOptionPane.showOptionDialog(null, "Elija unidades", "Unidades",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones, null);

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Intoduce la cantidad"));

        switch (opcion) {
            case 0:
            despues = ahora.plusMonths(cantidad);
            break;
            case 1:
                despues = ahora.plusWeeks(cantidad);
                break;
            case 2:
                despues = ahora.plusDays(cantidad);
                break;
            case 3:
                despues = ahora.plusHours(cantidad);
                break;
            case 4:
                despues = ahora.plusMinutes(cantidad);
                break;
            default:
                despues = ahora;
        }

// Creamos un formateador de fecha para que salga más elegante

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yy 'a las' hh:mm");
        String despuesFormateado = despues.format(formateador);

        JOptionPane.showMessageDialog(null,"La fecha será " + despuesFormateado);
    }
}
