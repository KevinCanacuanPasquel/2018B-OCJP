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
import java.text.*;
public class Slice {
    public static void main(String[] args) { 
        String s = "987.123456"; 
        double d  = 987.123456d; 
        NumberFormat nf = NumberFormat.getInstance(); 
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d) + " ");
        try {
            System.out.println(nf.parse(s));  
        } catch (Exception e) { System.out.println("got exc"); }
    }
}