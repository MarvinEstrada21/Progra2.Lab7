package marvinestrada_lab7;
public class Hombre_Lobo extends Bestias{

    public Hombre_Lobo() {
        super();
    }

    public Hombre_Lobo(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}