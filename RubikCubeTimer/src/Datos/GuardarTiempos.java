/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Lista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class GuardarTiempos {

    public Date dia = new Date();
    public DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public String tipocubo;
    public int numSolve = 1;
    public DecimalFormat decimales = new DecimalFormat("0.00");

    public GuardarTiempos() {
        hourFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void guardarTiemp(Lista listaSel, String tipcubo, int tipoGuard) {

        if (tipoGuard == 2) { //ARCHIVO PARA CARGAR
            try {
                String nombre = "";
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(file);
                File guarda = file.getSelectedFile();

                if (guarda != null) {
                    nombre = file.getSelectedFile().getName();
                    FileWriter save = new FileWriter(guarda + ".doc");//formato del archivo
                    BufferedWriter bw = new BufferedWriter(save);
                    PrintWriter pw = new PrintWriter(bw);
                    Nodo actual;
                    actual = listaSel.primero;

                    while (actual != null) {
                        pw.print(actual.getDato_string() + "/");
                        pw.print(actual.getScramble() + "/");
                        pw.print(actual.getDato() + "/");
                        actual = actual.enlace;
                    }
                    pw.close();
                    JOptionPane.showMessageDialog(null,
                            "El archivo se a guardado Exitosamente",
                            "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Su archivo no se ha guardado",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }
        if (tipoGuard == 1) {//ARCHIVO PARA USUARIO
            try {
                String nombre = "";
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(file);
                File guarda = file.getSelectedFile();

                if (guarda != null) {
                    nombre = file.getSelectedFile().getName();
                    FileWriter save = new FileWriter(guarda + ".doc");
                    BufferedWriter bw = new BufferedWriter(save);
                    PrintWriter pw = new PrintWriter(bw);

                    pw.println();
                    pw.println(" Sesion de Solves --> Tipo de Cubo: " + tipcubo);
                    pw.println(" Fecha de Sesion: " + dateFormat.format(dia));
                    pw.println(" Hora de Sesion: " + hourFormat.format(dia));
                    pw.println();
                    pw.println("---SOLVES");
                    pw.println();
                    pw.println("\n #Solve  Tiempo     Scramble");

                    Nodo actual;
                    actual = listaSel.primero;

                    while (actual != null) {
                        pw.print("   " + numSolve + "-   " + actual.getDato_string());
                        pw.print("    " + actual.getScramble());
                        pw.println();
                        pw.println();
                        numSolve += 1;
                        actual = actual.enlace;
                    }
                    pw.println();
                    pw.println("    Mejor Tiempo = " + decimales.format(listaSel.mejor_tiempo()));
                    pw.println("    Peor Tiempo  = " + decimales.format(listaSel.peor_tiempo()));
                    pw.println("    Numero de Solves = " + decimales.format(listaSel.largoLista()));
                    pw.println("    AVG Total    = " + decimales.format(listaSel.prom_Total()));
                    pw.close();
                    JOptionPane.showMessageDialog(null,
                            "El archivo se a guardado Exitosamente",
                            "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Su archivo no se ha guardado",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
