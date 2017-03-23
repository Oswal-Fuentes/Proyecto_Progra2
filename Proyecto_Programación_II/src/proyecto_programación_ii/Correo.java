/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_programación_ii;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Oswal Fuentes
 */
public class Correo implements Serializable {

    private String nombre, correo, contraseña, telefono, genero;
    private Date fecha_nacimiento;
    private Icon foto;
    private ArrayList<Correo_E> recibidos = new ArrayList();
    private ArrayList<Correo_E> enviados = new ArrayList();
    private ArrayList<Correo_E> spam = new ArrayList();
    private ArrayList<Correo_E> borradores = new ArrayList();
    private ArrayList<Correo_E> papelera = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Correo() {
    }

    public Correo(String nombre, String correo, String contraseña, String telefono, String genero, Date fecha_nacimiento, Icon foto) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.foto = foto;
    }

    public ArrayList<Correo_E> getRecibidos() {
        return recibidos;
    }

    public void setRecibidos(ArrayList<Correo_E> recibidos) {
        this.recibidos = recibidos;
    }
    
    public void add_correoRecibido(Correo_E c) {
        this.recibidos.add(c);
    }

    public ArrayList<Correo_E> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<Correo_E> enviados) {
        this.enviados = enviados;
    }

    public void add_correoEnviado(Correo_E c) {
        this.enviados.add(c);
    }

    public ArrayList<Correo_E> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Correo_E> spam) {
        this.spam = spam;
    }

    public ArrayList<Correo_E> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Correo_E> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Correo_E> getPapelera() {
        return papelera;
    }

    public void setPapelera(ArrayList<Correo_E> papelera) {
        this.papelera = papelera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return correo;
    }
}
