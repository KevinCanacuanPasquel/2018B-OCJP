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
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la base: "));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el exponente: "));
        
        int potencia = 1;
        int contador = 1;
        while(contador <= num2) {
            potencia *= num1;
            contador++;
        }
        
        System.out.println(num1 + " elevado a " + num2 + " = " + potencia);
    }
}
