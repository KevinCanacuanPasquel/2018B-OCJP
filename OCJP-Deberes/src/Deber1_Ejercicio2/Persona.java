/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio2;

/**
 *
 * @author kfc0_
 */
public class Persona {
    private final char HOMBRE = 'H';
    
    private String nombre;
    private String dni;
    private int edad;
    private char genero;
    private double altura;
    private double peso;
    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.genero = HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    public Persona(String nombre, int edad, char genero, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String cedula) {
        this.dni = cedula;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String generarDNI(){
        int dni = (int)(Math.random() * 90000001) + 10000000;
        char letra = calcularLetra(dni);
        return Integer.toString(dni) + letra;
    }
    
    private char calcularLetra(int dni) {
        final String caracteres = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        int modulo = dni % 23;
        char letra = caracteres.charAt(modulo);
        return letra;
    }
       
    public boolean esMayorEdad() {
        return this.edad > 18;
    }
    
    public int cacularIMC() {
        final int PESO_IDEAL = 0;
        final int SOBREPESO = 1;
        final int FLAQUEZA = -1;
        
        int imc = (int)(this.peso / Math.pow(this.altura, 2));
        if(imc < 20){
            return FLAQUEZA;
        }
        else if (imc > 25) {
            return PESO_IDEAL;
        }
        else {
            return PESO_IDEAL;
        }
    }
    
    public void comprobarGenero(char genero) {
        final char MUJER = 'M';
        if(genero == HOMBRE || genero == MUJER) {
            this.genero = genero;
        }
        else {
            this.genero = HOMBRE;
        }
    }
    @Override
     public String toString() {
        return "\nNombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nCedula: " + this.dni + 
                "\nGenero: " + this.genero +
                "\nPeso: " + this.peso +
                "\nAltura: " + this.altura;
    }
      
}
