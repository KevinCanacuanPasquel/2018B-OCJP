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
public class ReadingFor {
    public static void main(String[] args) {
        String s; 
        try { 
            FileReader fr = new FileReader("myfile.txt"); 
            BufferedReader br = new BufferedReader(fr);
            while((s = br.readLine()) != null)
                System.out.println(s);
            br.flush();
        } catch (IOException e) { System.out.println("io error"); }
    }
}
