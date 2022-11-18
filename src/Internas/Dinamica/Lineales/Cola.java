/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas.Dinamica.Lineales;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Georgui Azel
 */
public class Cola {
    
    public static void main(String[] args) {
        
        Queue<Persona> cola = new LinkedList();
        
  
            cola.add( new Persona(1, "Carlos", "Pacheco"));
            cola.add( new Persona(2, "Carlos", "Pacheco"));
            cola.add( new Persona(3, "Carlos", "Pacheco"));
            cola.add( new Persona(4, "Carlos", "Pacheco"));

            var it = cola.iterator();      
            System.out.println(cola.element().getNombre());
    }
    
    
           
    
}
