/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber6_IIB_Threads;

/**
 *
 * @author kfc0_
 */
public class Test {
    public static void main(String[] args) {
        printAll(args);
    }
    public static void printAll(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
            Thread.currentThread().sleep(1000);
        }
    }
}
