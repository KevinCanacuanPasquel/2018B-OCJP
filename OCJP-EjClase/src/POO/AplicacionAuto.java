/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Canacuan
 */
public class AplicacionAuto {
    
    public static void main(String []args) {
        String placaAux, colorAux, marcaAux;
        
        placaAux = JOptionPane.showInputDialog("Ingrese la placa");
        colorAux = JOptionPane.showInputDialog("Ingrese el color");
        marcaAux = JOptionPane.showInputDialog("Ingrese la marca");
        
        Auto autoAux = new Auto();
        autoAux.setPlaca(placaAux);
        autoAux.setColor(colorAux);
        autoAux.setMarca(marcaAux);
        
        JOptionPane.showMessageDialog(null, autoAux.toString());
    }
}
