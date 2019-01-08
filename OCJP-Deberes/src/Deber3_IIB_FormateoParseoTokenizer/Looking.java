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
import java.util.*; 
public class Looking { 
    public static void main(String[] args) { 
        String input = "1 2 a 3 45 6"; 
        Scanner sc = new Scanner(input); 
        int x = 0; 
        do {
            x = sc.nextInt();
            System.out.print(x + " "); 
        } while (x!=0);
    }
}
