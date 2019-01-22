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
public class MyThread  extends Thread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        x.start();
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " .. ");
        }
    }
}
