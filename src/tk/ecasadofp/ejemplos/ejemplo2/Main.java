package tk.ecasadofp.ejemplos.ejemplo2;

import tk.ecasadofp.ejemplos.ejemplo2.clases.Caballo;
import tk.ecasadofp.ejemplos.ejemplo2.clases.Coche;
import tk.ecasadofp.ejemplos.ejemplo2.clases.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Caballo(29,2,2024);
        Vehiculo vehiculo2 = new Coche();

        System.out.println(vehiculo1);
        vehiculo1.limpiar();

        System.out.println(vehiculo2);
        vehiculo2.limpiar();

    }
}
