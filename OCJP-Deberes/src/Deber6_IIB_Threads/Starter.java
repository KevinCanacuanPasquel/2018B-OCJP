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
public class Starter implements Runnable {

    void go(long id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + " ");
        //new Starter().run();
        //new Starter().start();
        //new Thread(new Starter());
        //new Thread(new Starter()).run();
        new Thread(new Starter()).start();
    }

    public void run() {
        go(Thread.currentThread().getId());
    }
}
