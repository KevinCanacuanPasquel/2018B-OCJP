/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesFracciones;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class OperacionesFracciones {
    
    public static void main(String[] args) {
        int numeradorAux_1, denominadorAux_1,numeradorAux_2, denominadorAux_2;
        String racionalAux_1, racionalAux_2;
        
        racionalAux_1 = JOptionPane.showInputDialog("Ingrese 1ra fraccion");
        StringTokenizer tokens = new StringTokenizer(racionalAux_1, "/");        
             //Se va a ingresar a la fraccion con
            //Divide el String en una subcadena
        numeradorAux_1 = Integer.parseInt(tokens.nextToken());
        denominadorAux_1 = Integer.parseInt(tokens.nextToken());
        
        racionalAux_2 = JOptionPane.showInputDialog("Ingrese 2da fraccion");
        tokens = new StringTokenizer(racionalAux_2, "/");        
            //Se va a ingresar a la fraccion con
            //Divide el String en una subcadena
        numeradorAux_2 = Integer.parseInt(tokens.nextToken());
        denominadorAux_2 = Integer.parseInt(tokens.nextToken());
        
        Racional racional_1 = new Racional(numeradorAux_1, denominadorAux_1);
        Racional racional_2 = new Racional(numeradorAux_2, denominadorAux_2);
        
        Fraccion fraccionAux = new Fraccion(racional_1, racional_2);
        
        JOptionPane.showMessageDialog(null, fraccionAux.toString());
    }
}
