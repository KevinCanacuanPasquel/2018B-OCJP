/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber2_IIB_EstructurasDeControl;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class PotenciaWhile {
    public static void main(String[] args) {
        int base = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la base: "));
        int exponente = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el exponente: "));
        
        int potencia = 1;
        int contador = 1;
        while(contador <= exponente) {
            potencia *= base;
            contador++;
        }
        
        System.out.println(base + " elevado a " + exponente + " = " + potencia);
    }
}
