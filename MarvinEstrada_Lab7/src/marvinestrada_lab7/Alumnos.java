package marvinestrada_lab7;
public class Alumnos extends Guerrero{
    private int cuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(int cuenta, String carrera, int edad, String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}