/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Wrapper {    
    public static void main(String[] args) {
        //Integer i2 = Integer.valueOf("101",2);
        Integer i2 = Integer.valueOf(2);
        byte b = i2.byteValue();        //convertir a dato primitivo
        short s = i2.shortValue();      //
        System.out.println(i2 + " - " + b + " - " + s);
        //JOptionPane.showMessageDialog(null, i2);
        
        int a1 = 0;
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, a1);
        
        String cadena = "HOLA";
        JOptionPane.showMessageDialog(null, cadena.toString());
        
        Integer a2 = 1000;
        Integer a3 = 1000;
        if(a2 == a3) JOptionPane.showMessageDialog(null, "Valores Iguales");
        //Como compara el mismo objeto, al tener objetos similares java los 
        //toma como un objeto solo, y no entra al 1er if
        if(a2.equals(a3)) JOptionPane.showMessageDialog(null, "Objetos Iguales");
        
        String cadena1 = "HOLA 2";
        String cadena2 = "0";
        JOptionPane.showMessageDialog(null, cadena1);
        cadena1 = null;
        JOptionPane.showMessageDialog(null, cadena1);
        
        String cadena3 = "";
        Runtime rt = Runtime.getRuntime();
        System.err.println("Memoria total de la JVM: " + rt.totalMemory());
        System.err.println("Memoria antes de procesar: " + rt.freeMemory());
        cadena3 = "HELLO"; 
        
        Date d = null;
        for (int i = 0; i < 1000; i++) {
            d = new Date();
            d = null;
        }
        
        System.err.println("Memoria luego de procesar: " + rt.freeMemory());
        rt.gc();;
        System.err.println("Memoria luego de ejecutar GC: " + rt.freeMemory());
    }    
}
