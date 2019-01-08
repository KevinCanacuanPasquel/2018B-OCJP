/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber3_IIB_FormateoParseoTokenizer;

/**
 *
 * @author kfc0_
 */
class TKO {
    public static void main(String[] args) {
        String s = "-";
        Integer x = 343;
        long L343 = 343L;
        if(x.equals(L343))  s += ".e1 ";
        if(x.equals(343))   s += ".e2 ";
        Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
        if(s1 == 7) s += "=s ";
        if(s1 < new Integer(7+1))  s += "fly ";
        System.out.println(s);
    }
}