/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Frank
 */
public class Idioma {
    
public String leerFila(int numeroFila,String direccion) {
        String contenidoFila = "";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            for (int i = 1; i <= numeroFila; i++) {
                contenidoFila = br.readLine();
                if (contenidoFila == null) return "";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    }     
  

    public void guardarEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Archivos gestor\\Idiomas\\Estado.txt"; 
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
