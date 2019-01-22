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
public class HorseTest {
    public static void main(String[] args) {
        class Horse {
            public String name;
            public Horse(String s) {
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        System.out.println(obj.name);
    }
}

