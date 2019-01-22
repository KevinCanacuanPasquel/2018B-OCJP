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
public class PruebasRunnable  implements Runnable{
    private int iteraciones = 4;
    
    public void run() {
        for (int x = 0; x < iteraciones; x++) {
            System.out.println("Ejecutando [ "
                    + Thread.currentThread().getName() + " ] [ " + x + " ] ");
        }
    }
    
    public static void main(String[] args) {
        
        Runnable hilo = new PruebasRunnable();
        Thread hilo1 = new Thread(hilo, "Hilo 1");
        Thread hilo2 = new Thread(hilo, "Hilo 2");
        Thread hilo3 = new Thread(hilo, "Hilo 3");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }   
}
