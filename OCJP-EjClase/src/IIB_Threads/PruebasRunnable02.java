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
public class PruebasRunnable02 implements Runnable {

    final static long TIEMPO_SLEEP = 50L;
    final static int CANTIDAD_EXTRACCIONES = 5;
    final static double MONTO_INICIAL = 50.0;
    final static double MONTO_EXTRACCION = 10.0;

    Cuenta cuenta;

    public PruebasRunnable02(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void run() {
        for (int x = 0; x < PruebasRunnable02.CANTIDAD_EXTRACCIONES; x++) {
            try {
                cuenta.efectuarRetiro(PruebasRunnable02.MONTO_EXTRACCION);
                System.out.println("Extraccion realizada... "
                        + Thread.currentThread().getName());
            } catch (SaldoInsuficienteException ex) {
                System.out.println("Error en el thread "
                        + Thread.currentThread().getName() + " - "
                        + ex.toString());
            }

            if (cuenta.getSaldo() < 0) {
                System.out.println("Error en el thread "
                        + Thread.currentThread().getName()
                        + " - El saldo de la cuenta es negativo");
            }
        }
    }

    static public void main(String[] args) {
        Cuenta cuenta = new Cuenta(PruebasRunnable02.MONTO_INICIAL);
        Thread usuario1 = new Thread(new PruebasRunnable02(cuenta), "usuario1");
        Thread usuario2 = new Thread(new PruebasRunnable02(cuenta), "usuario2");

        usuario1.start();
        usuario2.start();
    }
}

class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void efectuarRetiro(double monto) throws SaldoInsuficienteException {
        if (saldo < monto) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Solicitado:" + monto + " - Actual:"
                    + saldo);
        } else {
            try {
                Thread.sleep(PruebasRunnable02.TIEMPO_SLEEP);
            } catch (InterruptedException ex) {
                System.out.println("Error en el thread "
                        + Thread.currentThread().getName() + " - "
                        + ex.toString());
            }
            saldo -= monto;
        }
    }
}

class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String s) {
        super(s);
    }
}
