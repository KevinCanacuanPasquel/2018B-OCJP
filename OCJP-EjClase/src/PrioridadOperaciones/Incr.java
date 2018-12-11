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
public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;
        
        x*=x;
        y*=y;
        y*=y;
        x-=y;
        
        System.out.println(x);
    }
}
