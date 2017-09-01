/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_ricardoromero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ricky
 */
public class personas {
    private String nombre;
    private String apellido;
    private String correo;
    private String fecha_naci;
    private String pais;
    private int numero_telefono;
    private String contra;
    ArrayList<mensajes> noleidos = new ArrayList();
    ArrayList<mensajes> leidos = new ArrayList();
    ArrayList<mensajes> nodeseados = new ArrayList();
    ArrayList<mensajes> spam = new ArrayList();
    ArrayList<mensajes> borradores = new ArrayList();
    ArrayList<mensajes> enviados = new ArrayList();
    ArrayList<mensajes> eliminados = new ArrayList();
    ArrayList<mensajes> importantes = new ArrayList();

    public personas() {
    }

    public personas(String nombre, String apellido, String correo, String fecha_naci, String pais, int numero_telefono, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha_naci = fecha_naci;
        this.pais = pais;
        this.numero_telefono = numero_telefono;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(String fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<mensajes> getNoleidos() {
        return noleidos;
    }

    public void setNoleidos(ArrayList<mensajes> noleidos) {
        this.noleidos = noleidos;
    }

    public ArrayList<mensajes> getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList<mensajes> leidos) {
        this.leidos = leidos;
    }

    public ArrayList<mensajes> getNodeseados() {
        return nodeseados;
    }

    public void setNodeseados(ArrayList<mensajes> nodeseados) {
        this.nodeseados = nodeseados;
    }

    public ArrayList<mensajes> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<mensajes> spam) {
        this.spam = spam;
    }

    public ArrayList<mensajes> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<mensajes> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<mensajes> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<mensajes> enviados) {
        this.enviados = enviados;
    }

    public ArrayList<mensajes> getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList<mensajes> eliminados) {
        this.eliminados = eliminados;
    }

    public ArrayList<mensajes> getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList<mensajes> importantes) {
        this.importantes = importantes;
    }

    @Override
    public String toString() {
        return "personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", fecha_naci=" + fecha_naci + ", pais=" + pais + ", numero_telefono=" + numero_telefono + ", contra=" + contra + ", noleidos=" + noleidos + ", leidos=" + leidos + ", nodeseados=" + nodeseados + ", spam=" + spam + ", borradores=" + borradores + ", enviados=" + enviados + ", eliminados=" + eliminados + ", importantes=" + importantes + '}';
    }
    
    
}
