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
public class Principal {

    public static void main(String[] args) {
        Colas cola1 = new Colas();
        cola1.insertar(new Persona(1, "Azel", "Manuel"));
        cola1.insertar(new Persona(2, "Carlos", "Ruiz"));
        cola1.insertar(new Persona(4, "Juan", "Pacheco"));
        cola1.insertar(new Persona(8, "Ceprs", "Sandoval"));

        cola1.extraer();
        cola1.contar();
    }
}
