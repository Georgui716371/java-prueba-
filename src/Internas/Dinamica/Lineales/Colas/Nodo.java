/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas.Dinamica.Lineales.Colas;

import Internas.Dinamica.Lineales.Persona;

/**
 *
 * @author Georgui Azel
 */
public class Nodo {
    //Declaracion de atributos

    private Persona dato;
    private Nodo next;

    //Constructor
    public Nodo(Persona dato) {
        this.dato = dato;
    }

    //Metodos getter and setters
    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
