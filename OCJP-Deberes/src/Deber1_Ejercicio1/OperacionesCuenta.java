/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class OperacionesCuenta {

    public static void main(String[] args) {
        String titular;
        Double saldo;

        titular = JOptionPane.showInputDialog("Ingrese el titular");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta"
                + "\nSi no desea ingresar un saldo, digite 0"));
        
        if (saldo == 0) {
            Double cantidad_ingresar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea depositar"));
            System.out.print(ingresar(titular, saldo, cantidad_ingresar));
        }
        else {
            Double cantidad_retirar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar"));
            System.out.print(retirar(titular, saldo, cantidad_retirar));
        }   
    }

    public static String ingresar(String titular, Double saldo, Double ingreso) {
        Cuenta cuentaAux = new Cuenta(titular, saldo);
        if (ingreso >= 0) {
            cuentaAux.setCantidad(cuentaAux.getCantidad() + ingreso);
            return cuentaAux.getTitular() + ". Su nuevo saldo es: " + cuentaAux.getCantidad();
        } 
        else  return "ERROR...Cantidad negativa";
    }

    public static String retirar(String titular, Double saldo, Double retiro) {
        Cuenta cuentaAux = new Cuenta(titular, saldo);
        if ((cuentaAux.getCantidad() - retiro) <= 0) {
            cuentaAux.setCantidad(0.0);
            return cuentaAux.getTitular() + ". Su nuevo saldo es: $ " + cuentaAux.getCantidad();
        }
        else {
            cuentaAux.setCantidad(cuentaAux.getCantidad() - retiro);
            return cuentaAux.getTitular() + ". Su nuevo saldo es: $ " + cuentaAux.getCantidad();
        }

    }
}
