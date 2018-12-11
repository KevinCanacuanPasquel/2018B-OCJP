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
public class Resultados {
    public static void main(String[] args) {
        int nota = 4;
        
        for(int i = 4; i<=10; i++) {
        if(nota >= 5) {
            System.out.println(nota + "El resultado es aprobado ");
            
            switch(nota) {
                case 5:
                case 6: break;
                case 7:
                case 8: System.out.println(nota + "con Notable");
                        break;
                case 9: System.out.println(nota + "con Sobresaliente");;
                case 10: System.out.println(nota + "con Matricula");
            }
        }
        else
            System.out.println(nota + "El resultado es suspenso");
        
        nota++;
    } 
    } 
}
