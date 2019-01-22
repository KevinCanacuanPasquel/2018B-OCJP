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
public class Ej9 {
    public static synchronized void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        System.out.print(" X ");
        t.wait(10000);
        System.out.print(" Y ");
    }
}
