/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDeFlujo;

import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class main {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        //ejercicio11();
        //ejercicio12();
    }
    
    public static String ejercicio1() {
        System.out.println("1. Determinar si un número es divisible por otro"
                + " (el resultado de la división es un entero)");
        
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el numerador: "));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el denominador: "));
        float mod = num1 % num2;
        if(mod != 0.0) System.out.println(num1 + " / " + num2 + " -> "
                + "No es divisible");
        else System.out.println(num1 + " / " + num2 + " -> Es divisible");
        
        return "";
    }
    
    public static String ejercicio2() {
        System.out.println("2. Dados  dos  números  si  el  primer  "
                + "número  es divisible por el segundo, mostrar el "
                + "cociente en la pantalla");
        
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el numerador: "));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el denominador: "));
        float mod = num1 % num2;
        if(mod == 0.0) System.out.println(num1 + " / " + num2 + " = " 
                + (num1/num2));
        else System.out.println(num1 + " / " + num2 + " -> No es divisible");     
        
        return "";
    }
    
    public static String ejercicio3() {
        System.out.println("3. Saber si un numero entero esta dentro "
                + "del intervale [-128,...,127]");
        System.out.println("Si es el caso, escribir que el número es un byte");
        System.out.println("En caso contrario, mostrar mensaje de error");
        
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if (num >= -128 && num<=127) System.out.println("El numero " + num + " es un byte");
        else System.err.println("El numero " + num + " NO es un byte");
        
        return "";
    }
    
    public static String ejercicio4() {
        System.out.println("4. Saber si un número es positivo, "
                + "negativo, o cero");
        
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if(num < 0) System.out.println("El numero " + num + " es: NEGATIVO" );
        else if (num == 0) System.out.println("El numero " + num + " es: CERO" );
        else System.out.println("El numero " + num + " es: POSITIVO" );
        
        return "";
    }
    
    public static String ejercicio5() {
        System.out.println("5. Saber si un carácter es un dígito, "
                + "una letra mayúscula o una letra minúscula. ASCII:");
        System.out.println("dígito: 48 – 57");
        System.out.println("letra mayúscula: 65 – 90");
        System.out.println("letra minúscula: 97 – 122");
        
        char num = JOptionPane.showInputDialog(null, "Ingrese un caracter").charAt(0);
        int ascii = (int) num;
        if(ascii >= 48 && ascii <= 57) System.out.println(num + " es un DIGITO");
        else if(ascii >= 65 && ascii <= 90) System.out.println(num + " es una LETRA MAYUSCULA");
        else if(ascii >=97 && ascii <=122) System.out.println(num + " es una LETRA MINISCULA");
        else System.err.println(num + " es un CARACTER ESPECIAL");
        return "";
    }
    
    public static String ejercicio6() {
        System.out.println("6. Leer un número entero entre 1 y 10."
                + "Luego mostrar el número escrito en numerales romanos");
        
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero"));
        switch(num) {
            case 1:
                System.out.println(num + " en #romanos es: I");
                break;
            case 2:
                System.out.println(num + " en #romanos es: II");
                break;
            case 3:
                System.out.println(num + " en #romanos es: III");
                break;
            case 4:
                System.out.println(num + " en #romanos es: IV");
                break;
            case 5:
                System.out.println(num + " en #romanos es: V");
                break;
            case 6:
                System.out.println(num + " en #romanos es: VI");
                break;
            case 7:
                System.out.println(num + " en #romanos es: VII");
                break;
            case 8:
                System.out.println(num + " en #romanos es: VIII");
                break;
            case 9:
                System.out.println(num + " en #romanos es: IX");
                break;
            case 10:
                System.out.println(num + " en #romanos es: X");
                break;
            default:
                System.err.println(num + " esta fuera de rango");
                break;
        }
        return "";
    }
    
    public static String ejercicio7() {
        System.out.println("7. Escribir ¡Bienvenidos! en la pantalla 10 veces");
        for(int i = 1; i <= 10; i++) {
            System.out.println("¡Bienvenidos!");
        }
        
        return "";
    }
    
    public static String ejercicio8() {
        System.out.println("8. Calcular el valor de 30! (30 factorial)");
        
        int factorial =1;
        for(int i = 1; i <= 30; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de 30 es: " + factorial);
                
        return "";
    }
    
    public static String ejercicio9() {
        System.out.println("9. Introducir un número entero entre 0 y 10."
                + "Mientras que el número esté fuera del rango indicado,"
                + "introducir un número de nuevo");
        
        int num;       
        do {
            num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero entre 1 - 10"));
        } while (num > 10 || num < 0);
        
        return "";
    }
    
    public static String ejercicio10() {
        System.out.println("10. ¿Qué salida cree que se "
                + "producirá si aNumber es 3?");
        
        int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0) System.out.println("primera cadena");
        else System.out.println("segunda cadena");
        System.out.println("tercera cadena");
        
        System.out.println("\nReformatee el código para que el flujo sea más\n"
                + "comprensible, usando solamente espacios y cambios de línea.\n"
                + "Utilice corchetes, { y }, para aclarar el código más.");
        
        if (aNumber >= 0) {
            if(aNumber == 0) {
                System.out.println("primera cadena");
            } else {
             System.out.println("segunda cadena");   
            }
        }
        System.out.println("tercera cadena");
        
        return "";
    }
    
    public static String ejercicio11() {
        for(int i = 0; ;i++) {
            System.out.println("FOR INFINITO");
        }
    }
    
    public static String ejercicio12() {
        int x = 0;
        while(x<10) {
            System.out.println("WHILE INFINITO");
        }
        
        return "";
    }
}
