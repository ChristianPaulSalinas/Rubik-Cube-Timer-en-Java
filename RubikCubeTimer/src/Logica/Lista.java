/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Nodo;
import java.text.DecimalFormat;
import javax.swing.JLabel;

/**
 *
 * @author Christian
 */
public class Lista {

    public Nodo primero;
    public JLabel label;

    //Constructor 
    public Lista() {
        primero = null;
    }
    public DecimalFormat decimales = new DecimalFormat("0.00");

    public int largoLista() {
        System.out.println("lolojokn");
        Nodo aux = primero;
        int num = 0;
        while (aux != null) {
            num += 1;
            aux = aux.enlace;
        }
        System.out.println("largo lista = " + num);
        return num;
    }

    public Lista insertarCabezaLista(double entrada, String tiempo_string, String Scramble) {
        Nodo nuevo;
        nuevo = new Nodo(entrada, tiempo_string, Scramble);
        nuevo.enlace = primero;
        primero = nuevo;
        //label = x;
        return this;

    }

    public void eliminar(double entrada, String eliminar_tiempo) {
        Nodo actual, anterior;
        boolean encontrado;
        //inicializa los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
        //busqueda del nodo y del anterior
        while ((actual != null) && (!encontrado)) {
            encontrado = (eliminar_tiempo.equals(actual.dato_string));
            System.out.println(encontrado);
            //encontrado = (actual.dato_string == eliminar_tiempo);
            //con objetos:actual.dato.equals(entrada)
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;

            }
        }
        //enlace del nodo anterior con el siguiente
        if (actual != null) {
            //distingue entre que elnodo sea el cabecera o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;//no es necesario al ser una variablelocal
        }
    }

    public void visualizar() {
        Nodo n;

        n = primero;
        while (n != null) {
            System.out.println("\tTiempo de SOLVE = " + n.dato);
            n = n.enlace;
        }

    }

    public double prom_Total() {
        Nodo n;
        int num_solves = 0;
        double prom_tot;
        double sum_solves = 0;
        n = primero;
        while (n != null) {
            sum_solves += n.dato;
            num_solves++;
            n = n.enlace;
        }

        return (sum_solves / (double) num_solves);

    }

    public double mejor_tiempo() {
        Nodo n;
        double mejor;
        n = primero;
        mejor = n.dato;
        while (n != null) {
            if (n.dato < mejor) {
                mejor = n.dato;
            }
            n = n.enlace;
        }
        return mejor;
    }

    public double peor_tiempo() {
        Nodo n;
        double mayor;
        n = primero;
        mayor = n.dato;
        while (n != null) {
            if (n.dato > mayor) {
                mayor = n.dato;
            }
            n = n.enlace;
        }
        return mayor;
    }

    public void penalizacion(JLabel label_Tiem, String str_tiemp) {
        Nodo actual;
        boolean encontrado;
        actual = primero;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {
            encontrado = (str_tiemp.equals(actual.dato_string)) || (str_tiemp.equals((actual.dato_string) + "+2"));
            System.out.println(encontrado);
            System.out.println(!encontrado);
            if (encontrado == true) {
                actual.dato = actual.dato + 2.00;
                actual.dato_string = actual.dato_string + "+2";
                label_Tiem.setText(actual.dato_string);
            }
            actual = actual.enlace;
        }

    }

    public Lista insertarNUMmejores(int long_lista, Lista lista, double entrada, JLabel x, String tiempo_string, String Scramble) {
        if (lista.largoLista() < long_lista) {
            System.out.println("en clase lista" + lista.largoLista());
            Nodo nuevo;
            nuevo = new Nodo(entrada, tiempo_string, Scramble);
            nuevo.enlace = primero;
            primero = nuevo;
            label = x;
            return this;
        } else {
            Nodo actual;
            actual = primero;
            Nodo nuevo = actual;//Mayor tiempo
            System.out.println("lol..1");
            while ((actual != null)) {
                if (actual.dato > nuevo.dato) {
                    nuevo = actual;
                }
                actual = actual.enlace;
            }
            System.out.println(nuevo.getDato());

            if (nuevo.getDato() > entrada) {
                eliminar(nuevo.getDato(), nuevo.dato_string);
                Nodo nuevo1;
                nuevo1 = new Nodo(entrada, tiempo_string, Scramble);
                nuevo1.enlace = primero;
                primero = nuevo1;
                label = x;
                return this;
            } else {
                System.out.println("nada");
                return null;
            }
        }
    }

    public String listar5(Lista lista) {
        Nodo actual;
        actual = primero;
        String todo = "<html><body>";
        while (actual != null) {
            //"<html><body>JLabel con <br> varias <br>linea :-) </body></html>" 
            todo = todo + actual.dato_string + "<br>";
            actual = actual.enlace;
        }
        todo = todo + "</body></html>";
        return todo;
    }

    public Lista obtListaNumSolves(Lista lista) {
        Lista numSolves = new Lista();
        Nodo aux = primero;
        int num = 1;
        while (aux != null) {
            numSolves.insertarCabezaLista(num, null, null);
            aux = aux.enlace;
            num += 1;
        }
        //System.out.println("largo lista = " + num);
        return numSolves;
    }
    
}
/*
    public void actualizar5(Lista lista, Lista listaTot) {
        if (lista.largoLista() < 5) {

        }
    }
/*
    public Lista actualizar10(Lista lista, Lista listaTot) {

        Lista listaParametro = new Lista();
        Lista listaORD = new Lista();
        listaParametro = listaTot;

        //busqueda del nodo y del anterior
        while (listaParametro.largoLista() != 0) {
            Nodo actual;
            actual = listaParametro.primero;
            Nodo menor = actual;
            
            while ((actual != null)) {
                if (actual.dato < menor.dato) {
                    menor = actual;
                }
                actual = actual.enlace;
            }

            listaORD.insertarCabezaLista(menor.getDato(), menor.getDato_string(), menor.getScramble());
            listaParametro.eliminar(menor.getDato(), menor.getDato_string());

        }
        return listaORD;
/*
        Nodo actual;
        actual = primero;
        Nodo nuevo = actual;//Mayor tiempo

        System.out.println(
                "lol..1");
        while ((actual != null)) {
            if (actual.dato > nuevo.dato) {
                nuevo = actual;
            }
            actual = actual.enlace;
        }

        if (lista.largoLista()
                < 10) {
            Nodo actual;

            actual = listaTot.primero;
            //Nodo nuevo = actual;//Menor tiempo
            System.out.println("lol..1");
            while ((actual != null)) {
                Nodo actualMEJ;
                actualMEJ = lista.primero;
                while (actualMEJ != null) {
                    if (actual.dato < actualMEJ.dato) {
                        lista.insertarNUMmejores(10, lista, actual.getDato(), null, actual.getDato_string(), actual.getScramble());
                    }
                    actualMEJ = actualMEJ.enlace;
                }
                actual = actual.enlace;
                /*
                if (actual.dato < nuevo.dato) {
                    Nodo actualMEJ;
                    actualMEJ = lista.primero;
                    while(actualMEJ != null){
                        if(actual.dato == actualMEJ.dato){
                            
                        }
                    }
                        
                    nuevo = actual;
                }
                actual = actual.enlace;
            }*/
            
        
    
