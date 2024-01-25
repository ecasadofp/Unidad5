package tk.ecasadofp.ejemplos.ejemplo2.clases;

import java.time.LocalDate;

public class Caballo extends Vehiculo{
    private LocalDate fechaNacimiento;

    public Caballo(int velMedia, int numPasajeros, Color color,int dia, int mes, int year){
        super(velMedia, numPasajeros , color);
        fechaNacimiento = LocalDate.of(year,mes,dia);

    }
    @Override
    public void limpiar(){
        System.out.println("Cepíllalo");
    }
}
