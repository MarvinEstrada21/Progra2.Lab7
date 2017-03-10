package marvinestrada_lab7;
public class Dragon extends Bestias{

    public Dragon() {
        super();
    }

    public Dragon(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar(Guerrero guerrero) {
        double salud_against, ataque, defensa1, defensa2, op_salud;
        ataque = guerrero.getAtaque() * 0.35;
        salud_against = (guerrero.getAtaque() + ataque) - guerrero.getDefensa();
        defensa1 = guerrero.getDefensa() * 0.15;
        defensa2 = guerrero.getDefensa() - defensa1;
        guerrero.setDefensa(defensa2);
        op_salud = guerrero.getSalud() - salud_against;
        guerrero.setSalud(op_salud);
    }
}