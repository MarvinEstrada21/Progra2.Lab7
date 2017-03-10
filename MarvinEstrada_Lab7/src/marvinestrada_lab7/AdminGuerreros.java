package marvinestrada_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminGuerreros {
    ArrayList<Guerrero> lista_guerreros = new ArrayList();
    File archivo = null;

    public AdminGuerreros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerrero> getLista_guerreros() {
        return lista_guerreros;
    }

    public void setLista_guerreros(ArrayList<Guerrero> lista_guerreros) {
        this.lista_guerreros = lista_guerreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setGuerrero(Guerrero g){
        lista_guerreros.add(g);
    }
    
    @Override
    public String toString() {
        return "AdminGuerreros{" + "lista_guerreros=" + lista_guerreros + ", archivo=" + archivo + '}';
    }

     public void cargarArchivo() {
        try {
            lista_guerreros = new ArrayList();
            Guerrero temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Guerrero) objeto.readObject()) != null) {
                        lista_guerreros.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guerrero t : lista_guerreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}