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
public class PruebasRunnable03 implements Runnable {

    final static long TIEMPO_SLEEP = 50L;
    final static int CANTIDAD_EXTRACCIONES = 5;
    final static double MONTO_INICIAL = 50.0;
    final static double MONTO_EXTRACCION = 10.0;

    Cuenta2 cuenta;

    public PruebasRunnable03(Cuenta2 cuenta) {
        this.cuenta = cuenta;
    }

    public void run() {
        for (int x = 0; x < PruebasRunnable03.CANTIDAD_EXTRACCIONES; x++) {
            try {
                cuenta.efectuarRetiro(PruebasRunnable03.MONTO_EXTRACCION);
                System.out.println("Extraccion realizada... " + Thread.currentThread().getName());
            } catch (SaldoInsuficienteException ex) {
                System.out.println("Error en el thread " + Thread.currentThread().getName() + " - " + ex.toString());
            }

            if (cuenta.getSaldo() < 0) {
                System.out.println("Error en el thread " + Thread.currentThread().getName() + " - El saldo de la cuenta es negativo");
            }
        }
    }

    static public void main(String[] args) {
        Cuenta2 cuenta = new Cuenta2(PruebasRunnable03.MONTO_INICIAL);
        Thread usuario1 = new Thread(new PruebasRunnable03(cuenta), "usuario1");
        Thread usuario2 = new Thread(new PruebasRunnable03(cuenta), "usuario2");

        usuario1.start();
        usuario2.start();
    }
}

class Cuenta2 {

    private double saldo;

    public Cuenta2(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void efectuarRetiro(double monto) throws SaldoInsuficienteException {
        if (saldo < monto) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Solicitado:" + monto + " - Actual:" + saldo);
        } else {
            try {
                Thread.sleep(PruebasRunnable03.TIEMPO_SLEEP);
            } catch (InterruptedException ex) {
                System.out.println("Error en el thread " + Thread.currentThread().getName() + " - " + ex.toString());
            }
            saldo -= monto;
        }
    }
}
