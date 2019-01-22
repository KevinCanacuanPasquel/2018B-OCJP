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
public class WaitTest {
    public static void main(String[] args) {
        System.out.print("1 ");
        synchronized(args) {
            System.out.print("2 ");
            try { 
                args.wait();
            }
            catch(InterruptedException e) { }
        }
        System.out.print("3 ");
    }
}
