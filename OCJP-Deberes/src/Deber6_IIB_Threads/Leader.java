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
public class Leader implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new Leader());
        t.start();
        System.out.print("m1 ");
        t.join();
        System.out.print("m2 ");
    }

    public void run() {
        System.out.print("r1 ");
        System.out.print("r2 ");
    }
}
