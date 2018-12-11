/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrioridadOperaciones;

/**
 *
 * @author kfc0_
 */
public class McGee {
    public static void main(String[] args) {
        Days d1 = Days.TH;
        Days d2 = Days.M;
        for(Days d: Days.values()) {
            if(d.equals(Days.F)) break;
            d2 = d;
        }
        System.out.println((d1 == d2)?"same old" : "newly new");
    }
    enum Days{M,T,W,TH,F,SA,SU}
}
