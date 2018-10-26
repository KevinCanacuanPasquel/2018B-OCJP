/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Main {
    
    public static void main(String[] args) {
        Aula aula = new Aula();
        if(aula.puedeDarClase()) {
            JOptionPane.showMessageDialog(null, aula);
        }
        else {
            JOptionPane.showConfirmDialog(null, "No se puede dar clase en el Aula: \n\n" + aula);
        }
    }
    
}
