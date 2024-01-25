package tk.ecasadofp.ejemplos.ejemplo2.clases;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(int velMedia, int numPasajeros, Color color,int numPuertas){
        super(velMedia, numPasajeros , color);
        this.numPuertas = numPuertas;

    }
    @Override
    public void limpiar() {
        System.out.println("Mételo al tunel de lavado");
    }

}
