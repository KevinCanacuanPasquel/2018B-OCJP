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
import java.util.regex.*; 
public class Archie { 
    public static void main(String[] args) { 
        Pattern p = Pattern.compile(args[0]); 
        Matcher m = p.matcher(args[1]); 
        int count = 0; 
        while(m.find())
            count++;
        System.out.print(count);
    }
}
