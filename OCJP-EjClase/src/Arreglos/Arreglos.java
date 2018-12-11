/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author kfc0_
 */
public class Arreglos {
    public static void main(String[] args) {
        
        int []array_a = {1,2,3};
        int [][] array_b;
        int [][][]array_c;
        System.out.println(array_a[2]);
        
      //  ejercicio2();
    }
    
    public static void ejercicio2() {
        int [] array_a = new int [5];
        int [][] array_b;
        int [][][] array_c;
        Persona [] persona = new Persona[5];
        Persona [] persona_2;
        
        array_a[0] = 170;
        array_a[1] = 1;
        array_a[2] = 17;
        array_a[3] = 70;
        array_a[4] = 7;
        
        System.out.println(array_a[0] + " -- " + array_a[3]);
        
        persona[1] = new Persona(123,"Kevin","Canacuan", "M", "Vicentina", 23);
        persona[1] = new Persona(1234,"Jorge","Zambrano", "M", "Floresta", 3);
        persona[1] = new Persona(12345,"Mario","Giler", "F", "Valle", 30);
        persona[1] = new Persona(123456,"Hugo","Montero", "M", "Cumbaya", 22);
        
        for(int i=0; i<persona.length; i++) {
            System.out.println("Persona" + i);
            System.out.println(persona[i]);
        }
    }
}

