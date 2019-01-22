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
public class City {
    class Manhattan {
        void doStuff() throws Exception { System.out.print("x "); }
    }
    class TimesSquare extends Manhattan {
        void doStuff() throws Exception { }
    }
    public static void main(String[] args) throws Exception {
        new City().go();
    }
    void go() throws Exception { new TimesSquare().doStuff(); }
}