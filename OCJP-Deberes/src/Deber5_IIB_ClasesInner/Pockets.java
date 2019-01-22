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
import java.util.*;
public class Pockets {
    public static void main(String[] args) {
        String[] sa = {"nickel", "button", "key", "lint"}; 
        Sorter s = new Sorter(); 
        for(String s2: sa) 
            System.out.print(s2 + " "); 
        Arrays.sort(sa,s);
        System.out.println();
        for(String s2: sa)
            System.out.print(s2 + " ");
    }
    class Sorter implements Comparator<String> {
        public int compare(String a, String b) { 
            return b.compareTo(a);
        }  
    }
}