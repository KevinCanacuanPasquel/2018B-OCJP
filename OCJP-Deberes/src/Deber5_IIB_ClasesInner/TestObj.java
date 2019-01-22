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
public class TestObj {
    public static void main(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        }
    System.out.println(o.equals("Fred"));
    }
}

