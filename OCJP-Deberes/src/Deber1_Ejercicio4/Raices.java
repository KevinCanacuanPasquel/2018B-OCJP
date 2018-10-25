/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Raices {
    
    public static void main(String[] args) {
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente C"));
        
        Ecuacion ecuacionAux = new Ecuacion();
        ecuacionAux.setA(a);
        ecuacionAux.setB(b);
        ecuacionAux.setC(c);
        
        System.out.println(calcular(ecuacionAux.getA(), 
                ecuacionAux.getB(), ecuacionAux.getC()));
        
       
    }
    
    public static Double getDiscriminante(int a, int b, int c){
        int bAux = b * b;
        int acAux = 4 * a * c; 
        int discriminanteAux = bAux - acAux;
        Double discriminante = Double.valueOf(discriminanteAux); 
        return discriminante;
    }
    
    public static Boolean tieneRaices(int a, int b, int c) {
        Double discriminante = getDiscriminante(a, b, c);
        if (discriminante > 0) return true;
        else return false;
    }
    
    public static Boolean tieneRaiz(int a, int b, int c) {
        Double discriminante = getDiscriminante(a, b, c);
        if (discriminante == 0) return true;
        else return false;
    }
    
    public static String obtenerRaices(int a, int b, int c) {
        Double discriminante = getDiscriminante(a, b, c);
        
        Double raiz1Aux = Double.valueOf(-b + Math.sqrt(discriminante));
        Double raiz1 = (raiz1Aux) / (2 * a);
        
        Double raiz2Aux = Double.valueOf(-b - Math.sqrt(discriminante));
        Double raiz2 = (raiz2Aux) / (2 * a);
        
        return "Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2;
    }
    
    
    public static String obtenerRaiz(int a, int b, int c) {
        Double discriminante = getDiscriminante(a, b, c);
        
        Double raiz1Aux = Double.valueOf(-b + discriminante);
        Double raiz1 = (raiz1Aux) / (2 * a);
        
        Double raiz2Aux = Double.valueOf(-b - discriminante);
        Double raiz2 = (raiz2Aux) / (2 * a);
        
        return "Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2;
    }
    
    public static String calcular(int a, int b, int c){
        if (tieneRaices(a, b, c) == true) return obtenerRaices(a, b, c);
        else if (tieneRaiz(a, b, c) == true) return obtenerRaiz(a, b, c);
        else return "NO EXISTEN RAICES";
    }

}
