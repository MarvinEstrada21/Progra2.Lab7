package marvinestrada_lab7;

import java.io.Serializable;

public abstract class Guerrero implements Serializable{
    private String nombre;
    private String nickname;
    private double ataque;
    private double defensa;
    private double salud;
    private double puntos;
    private static final long SerialVersionUID = 777l;
    
    public Guerrero() {
    }

    public Guerrero(String nombre, String nickname, double ataque, double defensa, double salud, double puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public abstract void atacar(Guerrero guerrero); 
}