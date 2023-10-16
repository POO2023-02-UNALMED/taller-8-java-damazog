package main.java.futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, short golesMarcados, byte dorsal) {
        super(nombre, edad, "jugador");
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    
    @Override
    public boolean jugarConLasManos(){
    	return false;
    }
    
    @Override
    public int compareTo(Futbolista otroFutbolista) {
        if (otroFutbolista instanceof Jugador) {
            Jugador otroJugador = (Jugador) otroFutbolista;
            return Math.abs(this.getEdad() - otroJugador.getEdad());
        }
        return super.compareTo(otroFutbolista);
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }
}
