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
class A { 
    void m() {
        System.out.println("outer");
    }
}
public class TestInners {
    public static void main(String[] args) {
        new TestInners().go();
    }
    void go() {
        new A().m();
        class A { void m() { System.out.println("inner"); } }
    }
    class A { void m() { System.out.println("middle"); } }
}