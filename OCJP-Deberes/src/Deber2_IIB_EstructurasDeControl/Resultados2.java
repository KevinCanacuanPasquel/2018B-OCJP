/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber2_IIB_EstructurasDeControl;

/**
 *
 * @author kfc0_
 */
public class Resultados2 {
    public static void main(String[] args) {
        int nota = 4;
        
        for(int i=4; i<=10 ; i++) {
        System.out.println((nota >= 5) ? (nota < 8) ?
                nota + " - Entrevistar" : nota + " - Contratar" : nota + 
                        " - Rechazar");
        nota++;
    }
    }
}
