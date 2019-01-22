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
public class ThreadDemo {

    synchronized void a() {
        actBusy();
    }

    static synchronized void b() {
        actBusy();
    }

    static void actBusy() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        final ThreadDemo x = new ThreadDemo();
        final ThreadDemo y = new ThreadDemo();
        Runnable runnable = new Runnable() {
            public void run() {
                int option = (int) (Math.random() * 4);
                switch (option) {
                    case 0:
                        x.a();
                        break;
                    case 1:
                        x.b();
                        break;
                    case 2:
                        y.a();
                        break;
                    case 3:
                        y.b();
                        break;
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
