/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author kfc0_
 */
public class HijoException extends PadreException{
    
    public HijoException() {
    }
        
    public HijoException(String s) {
        super(s);
    }
    
}
