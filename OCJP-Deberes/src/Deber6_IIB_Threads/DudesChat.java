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
class Dudes {

    static long flag = 0;

    void chat(long id) {
        if (flag == 0) {
            flag = id;
        }
        for (int x = 1; x < 3; x++) {
            if (flag == id) {
                System.out.print("yo ");
            } else {
                System.out.print("dude ");
            }
        }
    }

}

public class DudesChat implements Runnable {

    static Dudes d;

    public static void main(String[] args) {
        new DudesChat().go();
    }

    void go() {
        d = new Dudes();
        new Thread(new DudesChat()).start();
        new Thread(new DudesChat()).start();
    }

    public void run() {
        d.chat(Thread.currentThread().getId());
    }
}
