/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrioridadOperaciones;

/**
 *
 * @author kfc0_
 */
public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        Boolean b1 = true;
        Boolean b2 = false;
        if((b2 = false) | (21%5) > 2) s += "x";
        if(b1 || (b2 == true)) s += "y";
        if(b2 == true) s += "z";
        System.out.println(s);
    }
}
