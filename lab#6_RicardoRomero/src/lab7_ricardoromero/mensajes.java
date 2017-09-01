/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_ricardoromero;

/**
 *
 * @author ricky
 */
public class mensajes {
    private String emisor;
    private String receptor;
    private String contenido;

    public mensajes() {
    }

    public mensajes(String emisor, String receptor, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "mensajes{" + "emisor=" + emisor + ", receptor=" + receptor + ", contenido=" + contenido + '}';
    }
    
    
}
