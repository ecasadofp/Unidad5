package tk.ecasadofp.ejemplos.ejemplo2.clases;

import java.time.LocalDate;

public class Caballo extends Vehiculo{
    LocalDate fechaNacimiento;

    public Caballo(int dia, int mes, int year){

        fechaNacimiento = LocalDate.of(year,mes,dia);

    }
    @Override
    public void limpiar(){
        System.out.println("Cepíllalo");
    }
}
