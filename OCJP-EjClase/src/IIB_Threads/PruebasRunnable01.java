/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIB_Threads;

/**
 *
 * @author kfc0_
 */
import java.lang.InterruptedException;

public class PruebasRunnable01  extends PruebasRunnable{
    
    public static void main(String[] args) {
        
        (new Thread(new PruebasRunnable01())).start();
    }
    
    public void run() {
        for (int x = 1; x < 101; x++) {
            if(x % 10 == 10) System.out.println("Running " + x);
        }
        try {
            Thread.sleep(500); // 1 milisegundo * 500 = 1/2 segundo
        } catch (InterruptedException ex) {
            
        }
    }
}
