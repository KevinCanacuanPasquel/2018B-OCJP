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
import java.io.*; 
public class Talker { 
    public static void main(String[] args) { 
        Console c = System.console();
    String u = c.readLine("%s", "username: "); 
    System.out.println("hello " + u); 
    String pw;
    if(c != null && (pw = c.readPassword("%s", "password: ")) != null)
    // check for valid password
    }
}