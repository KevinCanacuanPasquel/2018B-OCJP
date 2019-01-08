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
public class Theory {
    public static void main(String[] args) {
        String s1 = "abc"; 
        String s2 = s1; 
        s1 += "d"; 
        System.out.println(s1 + " " + s2 + " " + (s1==s2)); 
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
    }
}
