package marvinestrada_lab7;
public class Minotauro extends Bestias{

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar(Guerrero guerrero) {
        double laif, laif2, porcentaje, suma, against, against2;
        porcentaje = guerrero.getDefensa() * 0.50;
        suma = guerrero.getDefensa() * porcentaje;
        laif = (this.getAtaque() * 2) - suma;
        laif2 = guerrero.getSalud() - laif;
        guerrero.setSalud(laif2);
        against = guerrero.getAtaque() * 0.10;
        against2 = guerrero.getAtaque() * against;
        guerrero.setAtaque(against2);
    }
}