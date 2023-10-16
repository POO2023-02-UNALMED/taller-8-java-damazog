package main.java.futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public Portero() {
        super();
        this.golesRecibidos = 0;
        this.dorsal = 1;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        if (otroFutbolista instanceof Portero) {
            Portero otroPortero = (Portero) otroFutbolista;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        }
        return super.compareTo(otroFutbolista);
    }
}