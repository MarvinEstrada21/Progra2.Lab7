package marvinestrada_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminAlumnos {
    private ArrayList<Alumnos> lista_alumnos = new ArrayList();
    private File archivo = null;

    public AdminAlumnos() {
    }

    public AdminAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumnos> getLista_alumnos() {
        return lista_alumnos;
    }

    public void setLista_alumnos(ArrayList<Alumnos> lista_alumnos) {
        this.lista_alumnos = lista_alumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Alumnos al){
        lista_alumnos.add(al);
    }
    
    @Override
    public String toString() {
        return "AdminAlumnos{" + "lista_alumnos=" + lista_alumnos + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        try {
            lista_alumnos = new ArrayList();
            Alumnos temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumnos) objeto.readObject()) != null) {
                        lista_alumnos.add(temp);
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
            for (Alumnos t : lista_alumnos) {
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