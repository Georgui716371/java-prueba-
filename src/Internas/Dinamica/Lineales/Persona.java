/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas.Dinamica.Lineales;

/**
 *
 * @author Georgui Azel
 */
public class Persona {
    private int  numero;
    private String nombre;
    private String apellido;

    public Persona(int numero, String nombre, String apellido) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    
    
}
