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

//Uso de fracciones y tipos racional

public class Fraccion {
    private Racional racional_1;
    private Racional racional_2;

    public Fraccion() {
        this.racional_1 = new Racional();
        this.racional_2 = new Racional();
    }

    public Fraccion(Racional racional_1, Racional racional_2) {
        this.racional_1 = racional_1;
        this.racional_2 = racional_2;
    }

    public Racional getRacional_1() {
        return racional_1;
    }

    public void setRacional_1(Racional racional_1) {
        this.racional_1 = racional_1;
    }

    public Racional getRacional_2() {
        return racional_2;
    }

    public void setRacional_2(Racional racional_2) {
        this.racional_2 = racional_2;
    }
    
    public String toString () {
        return "Operaciones con fracciones " +
                "\nFraccion 1: " + this.racional_1 + 
                "\nFraccion 2: " + this.racional_2 +
                "\nSuma: " + Racional.Sumar(racional_1, racional_2) +
                "\nResta: " + Racional.Restar(racional_1, racional_2) + 
                "\nMultiplicacion: " + Racional.Multiplicar(racional_1, racional_2) +
                "\nDivision: " + Racional.Dividir(racional_1, racional_2);
        
    }
}
