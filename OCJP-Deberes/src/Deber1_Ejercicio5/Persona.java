/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio5;

import java.util.Random;
/**
 *
 * @author kfc0_
 */
public abstract class Persona {
    private String nombre;
    private int edad;
    private char genero;

    public Persona() {
        this.nombre = generarNombre();
        this.edad = generarEdad();
        this.genero = generarGenero();
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    
    public String generarNombre() {
        final String nombre = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        int random =  (int) ((Math.random() * 25) + 1);
        char letra = nombre.charAt(random);
        return String.valueOf(letra);
    }
    
    private int generarEdad() {
        return (int) ((Math.random() * 7) + 11);
    }
    
    private char generarGenero() {
        return Math.random() > 0.5 ? 'H' : 'M';
    }
    
    public abstract int getProbabilidadAsistencia();
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nEdad: " + this.edad + 
                "\nGenero: " + this.genero;
    }
    
}
