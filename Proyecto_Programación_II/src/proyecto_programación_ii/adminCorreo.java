/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_programación_ii;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Oswal Fuentes
 */
public class adminCorreo {

    private ArrayList<Correo> listaCorreos = new ArrayList();
    private File archivo = null;

    public adminCorreo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Correo> getListaCorreos() {
        return listaCorreos;
    }

    public void setListaCorreos(ArrayList<Correo> listaCorreos) {
        this.listaCorreos = listaCorreos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setCorreo(Correo c) {
        listaCorreos.add(c);
    }

    public void cargarArchivo() {
        try {
            listaCorreos = new ArrayList();
            Correo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Correo) objeto.readObject()) != null) {
                        listaCorreos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
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
            for (Correo t : listaCorreos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
