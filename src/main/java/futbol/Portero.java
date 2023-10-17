package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
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

    
    public int compareTo(Object o) {
            Portero otroPortero = (Portero) o;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
    }

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
    
}