/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Main {
    
    public static void main(String[] args) {
        
        //DATOS DE PERSONA 1
        Persona persona1 = new Persona(getNombrePersona(1), getEdadPersona(1), getGeneroPersona(1), getPesoPersona(1), getAlturaPersona(1));
        JOptionPane.showMessageDialog(null, persona1 + 
                getEsMayorEdad(1, persona1) + getPesoIdeal(1, persona1),
                "INFO PERSONA 1",JOptionPane.INFORMATION_MESSAGE);
        
        //DATOS DE PERSONA 2
        Persona persona2 = new Persona(getNombrePersona(2), getEdadPersona(2), getGeneroPersona(2));
        persona2.setPeso(getPesoPersona(2));
        persona2.setAltura(getAlturaPersona(2));
        JOptionPane.showMessageDialog(null, persona2 + 
                getEsMayorEdad(2, persona2) + getPesoIdeal(2, persona2),
                "INFO PERSONA 2", JOptionPane.INFORMATION_MESSAGE);
        
        //DATOS PERSONA 3
        Persona persona3 = new Persona();
        persona3.setNombre(getNombrePersona(3));
        persona3.setEdad(getEdadPersona(3));
        persona3.setGenero(getGeneroPersona(3));
        persona3.setPeso(getPesoPersona(3));
        persona3.setAltura(getAlturaPersona(3));
        JOptionPane.showMessageDialog(null, persona3 +
                getEsMayorEdad(3, persona3) + getPesoIdeal(3, persona3),
                "INFO PERSONA 3", JOptionPane.INFORMATION_MESSAGE);
                
    }
    
    public static String getNombrePersona(int id) {
        return JOptionPane.showInputDialog("Ingrese el NOMBRE de la " + id + " Persona : " );
    }
    public static int getEdadPersona(int id) {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese la EDAD de la " + id + " Persona : " ));
    }
    public static char getGeneroPersona(int id) {
        return JOptionPane.showInputDialog("Ingrese el GENERO (H ó M) de la " + id + " Persona : " ).charAt(0);
    }
    public static double getPesoPersona(int id) {
        return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el PESO de la " + id + " Persona : " ));
    }
    public static double getAlturaPersona(int id) {
        return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ALTURA de la " + id + " Persona : " ));
    }
    
    public static String getPesoIdeal(int id, Persona persona) {
        String peso = "\nLa persona " + id + " está: ";
        switch(persona.cacularIMC()) {
            case -1:
                peso += "CON FLAQUEZA";
                break;
            case 0:
                peso += "ES SU PESO IDEAL";
                break;
            case 1:
                peso += "CON SOBREPESO";
                break;
        }
        return peso;
    }
    
    public static String getEsMayorEdad(int id, Persona persona) {
        String mayorEdad = "\nLa persona " + id + " es " +
                (persona.esMayorEdad() ? "MAYOR" : "MENOR") + " de edad";
        return mayorEdad;
    }
    
}
