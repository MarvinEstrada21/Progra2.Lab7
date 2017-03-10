package marvinestrada_lab7;
public abstract class Bestias extends Guerrero{

    public Bestias() {
        super();
    }

    public Bestias(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }
    
    public abstract void atacar(); 

    @Override
    public String toString() {
        return super.toString();
    }
}