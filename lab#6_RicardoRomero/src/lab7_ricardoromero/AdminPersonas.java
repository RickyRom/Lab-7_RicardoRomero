/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_ricardoromero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class AdminPersonas {
    private ArrayList<personas> lista = new ArrayList();
    protected File archivo = null;

    public AdminPersonas() {
    }
    
    public AdminPersonas(String path) {
        archivo = new File(path);
    }

    public ArrayList<personas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<personas> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminPersonas{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }
    
    public void escribirarchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (personas t : lista) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getApellido()+ ";");
                bw.write(t.getCorreo()+ ";");
                bw.write(t.getContra()+ ";");
                bw.write(t.getNumero_telefono()+ ";");
                bw.write(t.getPais()+ ";");
                
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargararchivo() {
        if (archivo.exists()) {
            Scanner sc = null;
            lista = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext(";")) {
                    lista.add(new personas(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }// fin if exists
    }
}
