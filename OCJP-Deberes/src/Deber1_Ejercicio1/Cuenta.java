/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Cuenta {
    private String titular;
    private Double cantidad;

    public Cuenta() {
        this.cantidad = 0.0;
        this.titular = "";
    }

    public Cuenta(String titular) {
        this.titular = titular;
        //this.cantidad = cantidad;
    } 
    public Cuenta(String titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString() {
        return "El titular: " + this.titular +
                "\nTiene: $ " + this.cantidad;
    }
    
}
