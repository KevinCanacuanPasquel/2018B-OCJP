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
class Directories { 
    static String [] dirs = {"dir1", "dir2"};
    
    public static void main(String [] args) {
        for (String d : dirs) {
            // insert code 1 here
            String path = d;
            File file = new File(path, args[0]);
            // insert code 2 here
            System.out.print(file.isFile() + " ");
        }
    }
}