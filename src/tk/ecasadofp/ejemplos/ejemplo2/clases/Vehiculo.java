package tk.ecasadofp.ejemplos.ejemplo2.clases;

public abstract class Vehiculo {

    private int velMedia;
    private int numPasajeros;
    private Color color;

    public Vehiculo(int velMedia, int numPasajeros, Color color){
        this.velMedia = velMedia;
        this.numPasajeros = numPasajeros;
        this.color = color;
    }

    public abstract void limpiar();

    @Override
    public final String toString(){
        return String.format("Velocidad media: %d, número de pasajeros: %d. %s",velMedia, numPasajeros, color);
    }
}
