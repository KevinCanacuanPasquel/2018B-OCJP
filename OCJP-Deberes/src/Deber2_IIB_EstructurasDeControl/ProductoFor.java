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
public class ProductoFor {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
        
        int producto = 0;
        for(int i = 1; i<=num1 ; i++) {
            producto = producto + num2;
        }
        
        System.out.println(num1 + " * " + num2 + " = " + producto);
    }   
}
