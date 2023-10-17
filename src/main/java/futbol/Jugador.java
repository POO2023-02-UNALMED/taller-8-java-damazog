package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
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

    
    public int compareTo(Object o) { 
            Jugador otroJugador = (Jugador) o;
            return Math.abs(this.getEdad() - otroJugador.getEdad());
    } 
}