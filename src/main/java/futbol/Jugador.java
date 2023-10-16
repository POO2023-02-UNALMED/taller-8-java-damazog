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
    
    @Override
    public int compareTo(Futbolista otroFutbolista) {
        if (otroFutbolista instanceof Jugador) {
            Jugador otroJugador = (Jugador) otroFutbolista;
            return Math.abs(this.getEdad() - otroJugador.getEdad());
        }
        
        return super.compareTo(otroFutbolista);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Jugador) {
            Jugador otroJugador = (Jugador) o;
            return Math.abs(this.getEdad() - otroJugador.getEdad());
        }
        
        else if (o instanceof Futbolista) {
            Futbolista otroFutbolista = (Futbolista) o;
            return Math.abs(this.getEdad() - otroFutbolista.getEdad());
        }
    } 
}
