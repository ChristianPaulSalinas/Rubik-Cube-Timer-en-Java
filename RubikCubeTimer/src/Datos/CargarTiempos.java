/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Lista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class CargarTiempos {

    JFileChooser fileChooser = new JFileChooser();
    String texto;
    Lista listaT_;//lista total
    Lista lista5mej;//para 5 mejores
    Lista lista10mej;//para 10 mejores
    Lista cadaRegistro;
    double numero;
    String dato;
    String Scramble;

    public CargarTiempos() {
    }

    public String CargarTiemp(Lista listaSel, Lista lista5, Lista lista10) {
        listaT_ = listaSel;
        lista5mej = lista5;
        lista10mej = lista10;
        String text_aux = "";
        texto = "";

        try {
            fileChooser.showOpenDialog(fileChooser);//permite cargar la ventana
            File archivo = fileChooser.getSelectedFile();//seleccionar archivo y abrirlo
            if (archivo != null) {
                FileReader archivos = new FileReader(archivo);
                BufferedReader texto_completo = new BufferedReader(archivos);
                while ((text_aux = texto_completo.readLine()) != null) {
                    texto += text_aux + "\n";//se guarda todo en un texto
                }
                texto_completo.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;
    }

    public void CargaLista(String texto) {
        int y = 1;
        String campo = "";
        StringTokenizer token = new StringTokenizer(texto, "/");
        while (token.hasMoreElements()) {
            if (y == 4) {
                y = 1;//cada 3 existe un registro
            }
            StringTokenizer ne = new StringTokenizer(token.nextToken(), "/");
            int i = 0;
            while (ne.hasMoreElements()) {
                if (i == 0) {
                    campo = ne.nextToken();
                    i++;
                }
            }
            if (!"\n".equals(campo)) {
                System.out.println(campo);
                asignar_a_variables(campo, y);//asigno a variables de una lista
                y += 1;

            }
        }
    }

    public void asignar_a_variables(String camp, int numeroCampo) {
        if (numeroCampo == 1) {
            dato = camp;
        }
        if (numeroCampo == 2) {
            Scramble = camp;
        }
        if (numeroCampo == 3) {
            numero = Double.parseDouble(camp);
            listaT_.insertarCabezaLista(numero, dato, Scramble);//lista total
            lista5mej.insertarNUMmejores(5, lista5mej, numero, null, dato, Scramble);//lista de 5 mejores
            lista10mej.insertarNUMmejores(10, lista10mej, numero, null, dato, Scramble);//lista de 10 mejores
        }

    }
}
