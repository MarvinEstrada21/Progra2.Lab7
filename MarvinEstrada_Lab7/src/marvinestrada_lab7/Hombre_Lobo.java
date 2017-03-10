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
    public void atacar(Guerrero guerrero) {
        double vida_against, vida_against2;
        vida_against = this.getAtaque() - guerrero.getDefensa();
        vida_against2 = guerrero.getSalud() - vida_against;
        guerrero.setSalud(vida_against2);
    }
}