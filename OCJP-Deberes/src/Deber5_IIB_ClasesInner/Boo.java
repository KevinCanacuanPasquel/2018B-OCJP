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
class Boo {
   Boo(String s) { }
   Boo() { }
}
class Bar extends Boo {
   Bar() { }
   Bar(String s) {super(s);}    void zoo() {
       Boo f = new Bar() { };
   }
}

