package tk.ecasadofp.ejemplos.ejemplo2.clases;

public abstract class Vehiculo {

    int velMedia;
    int numPasajeros;
    Color color;

    public abstract void limpiar();

    @Override
    public final String toString(){
        return String.format("Velocidad media: %d, número de pasajeros: %d. %s",velMedia, numPasajeros, color);
    }
}
