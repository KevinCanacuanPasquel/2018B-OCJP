/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author kfc0_
 */
public class DivisionCero {
    public static void main(String[] args) {
        
        int numerador = 20;
        int denominador = 0;
        //Integer denominador = null;
        float division;
        
        System.out.println("Antes de la division");
        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch(NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Despues de la division");
        }
    }
    
}
