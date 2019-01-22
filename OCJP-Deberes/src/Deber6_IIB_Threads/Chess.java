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
public class Chess implements Runnable {

    public void run() {
        move(Thread.currentThread().getId());
    }

    synchronized void move(long id) {

        System.out.print(id
                + " ");
        System.out.print(id
                + " ");
    }

    public static void main(String[] args) {
        Chess ch = new Chess();
        new Thread(ch).start();
        new Thread(new Chess()).start();
    }
}
