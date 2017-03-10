package marvinestrada_lab7;
public class Fenix extends Bestias{

    public Fenix() {
        super();
    }

    public Fenix(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar(Guerrero guerrero) {
        double salud_against, ataque, ataque1, ataque2, op_salud;
        ataque = guerrero.getAtaque() * 0.75;
        salud_against = (guerrero.getAtaque() + ataque) - guerrero.getDefensa();
        op_salud = guerrero.getSalud() - salud_against;
        guerrero.setSalud(op_salud);
        ataque1 = guerrero.getAtaque() * 0.05;
        ataque2 = guerrero.getAtaque() - ataque1;
        guerrero.setAtaque(ataque2);
    }
}