/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesFracciones;

/**
 *
 * @author kfc0_
 */
public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 0;
        
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    //SUMA    
    public static Racional Sumar(Racional racional_1, Racional racional_2) {
        Racional racionalAux = new Racional(
                racional_1.numerador * racional_2.denominador + 
                racional_2.numerador * racional_1.denominador,
                racional_1.denominador * racional_2.denominador);
        
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    //RESTA    
    public static Racional Restar(Racional racional_1, Racional racional_2) {
        Racional racionalAux = new Racional(
                racional_1.numerador * racional_2.denominador - 
                racional_2.numerador * racional_1.denominador,
                racional_1.denominador * racional_2.denominador);
        
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    //MULTIPLICACION    
    public static Racional Multiplicar(Racional racional_1, Racional racional_2) {
        Racional racionalAux = new Racional(
                racional_1.numerador * racional_2.numerador, 
                racional_1.denominador * racional_2.denominador);
        
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    //DIVISION    
    public static Racional Dividir(Racional racional_1, Racional racional_2) {
        Racional racionalAux = new Racional(
                racional_1.numerador * racional_2.denominador, 
                racional_2.numerador * racional_1.denominador);
        
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    
    private int mod_euclides() {
        int a,b;
        a = Math.abs(numerador);
        b = Math.abs(denominador);
        
        if(b == 0)  return a;
        
        int c;
        while(b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        
        return a;
    }

    //Devolucion de datos simplificados
    public Racional Simplificar() {
        int mod = mod_euclides();
        numerador = numerador / mod;
        denominador = denominador / mod;
        return this;
    }
    
    public String toString () {
        return this.numerador + " / " + this.denominador;
    }
}
