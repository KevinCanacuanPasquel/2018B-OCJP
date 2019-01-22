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
public class PruebasRunnable04 {

    static public void main(String[] args) {
        (new PruebasRunnable04(new Object())).pruebaWait();
    }

    private Object bloqueador;

    public PruebasRunnable04(Object bloqueador) {
        this.bloqueador = bloqueador;
    }

    public void pruebaWait() {
        Incrementador incrementador = new Incrementador(bloqueador);
        (new Thread(incrementador)).start();
        synchronized (bloqueador) {
            try {
                System.out
                        .println("Esperando a que se complete el incrementador...");
                bloqueador.wait();
            } catch (InterruptedException ex) {
            }
            System.out.println("El total es: " + incrementador.getTotal());
        }
    }
}

class Incrementador implements Runnable {

    private int contador = 0;
    private Object bloqueador;

    public Incrementador(Object bloqueador) {
        this.bloqueador = bloqueador;
    }

    public int getTotal() {
        return contador;
    }

    public void run() {
        synchronized (bloqueador) {
            for (int x = 0; x < 100; x++) {
                contador++;
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
            System.out.println();
            bloqueador.notify();
        }
    }
}
