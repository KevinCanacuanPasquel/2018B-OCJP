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
public class Plane {
    
    static String s = "-";
    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }
    
    void s1() {
        try {
            s2();
        } catch (Exception e) {
            
        }
    }
    
}
