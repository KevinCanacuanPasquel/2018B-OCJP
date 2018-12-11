/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber2_IIB_EstructurasDeControl;

/**
 *
 * @author kfc0_
 */
public class Numeros {
    public static void main(String[] args) {
        for(int i = 1; i<=1000 ;i++) {
            if(i % 2 == 0)
                continue;
            if(i % 3 == 0)
                continue;
            System.out.println("Numeros: " + i);
            if(i >= 15)
                break;
        }
    }
}
