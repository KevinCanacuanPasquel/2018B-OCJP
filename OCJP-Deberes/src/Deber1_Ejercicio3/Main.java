/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Main {
    
    public static void main(String[] args) {
        String isbnAux1, tituloAux1, num_paginasAux1, autorAux1;
        String isbnAux2, tituloAux2, num_paginasAux2, autorAux2;
        
        isbnAux1 = JOptionPane.showInputDialog("Ingrese el ISBN del primer libro");
        isbnAux2 = JOptionPane.showInputDialog("Ingrese el ISBN del segundo libro");
        
        tituloAux1 = JOptionPane.showInputDialog("Ingrese el TITULO del primer libro");
        tituloAux2 = JOptionPane.showInputDialog("Ingrese el TITULO del segundo libro");
        
        autorAux1 = JOptionPane.showInputDialog("Ingrese el AUTOR del primer libro");
        autorAux2 = JOptionPane.showInputDialog("Ingrese el AUTOR del segundo libro");
        
        num_paginasAux1 = JOptionPane.showInputDialog("Ingrese el NUM_PAGINAS del primer libro");
        num_paginasAux2 = JOptionPane.showInputDialog("Ingrese el NUM_PAGINAS del segundo libro");
        
        Libro libroAux1 = new Libro();
        libroAux1.setIsbn(isbnAux1);
        libroAux1.setTitulo(tituloAux1);
        libroAux1.setAutor(autorAux1);
        libroAux1.setNum_paginas(num_paginasAux1);
        
        Libro libroAux2 = new Libro();
        libroAux2.setIsbn(isbnAux2);
        libroAux2.setTitulo(tituloAux2);
        libroAux2.setAutor(autorAux2);
        libroAux2.setNum_paginas(num_paginasAux2);
        
        JOptionPane.showMessageDialog(null, libroAux1.toString());
        JOptionPane.showMessageDialog(null, libroAux2.toString());
        
        JOptionPane.showMessageDialog(null, 
                Mayor_Num_Paginas(Integer.parseInt(libroAux1.getNum_paginas()),
                        Integer.parseInt(libroAux2.getNum_paginas())));
 
    }
    
    public static String Mayor_Num_Paginas(int pag_libro1, int pag_libro2) {
        if(pag_libro1 > pag_libro2) return "Libro 1 tiene mas hojas";
        else if (pag_libro1 == pag_libro2) return "Ambos tienen igual numeros de paginas";
        else return "Libro 2 tiene mas paginas";
    }
}
