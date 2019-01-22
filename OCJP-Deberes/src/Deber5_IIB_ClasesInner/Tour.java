/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber5_IIB_ClasesInner;

/**
 *
 * @author kfc0_
 */
public class Tour {
    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        Cathedral.Sanctum s = c.new Sanctum();
        s.go();
    } 
}
class Cathedral {
    class Sanctum {
        void go() { System.out.println("spooky"); }
    }
}
