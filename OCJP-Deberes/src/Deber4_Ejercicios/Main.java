/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber4_Ejercicios;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author kfc0_
 */
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "3. Algoritmo para saber si un número es par o impar.");
        JOptionPane.showMessageDialog(null, ejercicio3());
        JOptionPane.showMessageDialog(null, "4. Algoritmo que dados tres números determine cuál es el mayor.");
        JOptionPane.showMessageDialog(null, ejercicio4());
        JOptionPane.showMessageDialog(null, "5. Algoritmo para encontrar el volumen y el área de un cilindro.");
        JOptionPane.showMessageDialog(null, ejercicio5());
        JOptionPane.showMessageDialog(null, "6. Algoritmo para la potencia de un número.");
        JOptionPane.showMessageDialog(null, ejercicio6());
        JOptionPane.showMessageDialog(null, "7. Algoritmo para la raíz de un número.");
        JOptionPane.showMessageDialog(null, ejercicio7());
        JOptionPane.showMessageDialog(null, "8. Algoritmo para dividir 2 números.");
        JOptionPane.showMessageDialog(null, ejercicio8());
        JOptionPane.showMessageDialog(null, "9. Algoritmo para determinar un número positivo, negativo o neutro.");
        JOptionPane.showMessageDialog(null, ejercicio9());
        JOptionPane.showMessageDialog(null, "10. Algoritmo para encontrar el factorial de cualquier número.");
        JOptionPane.showMessageDialog(null, ejercicio10());
        JOptionPane.showMessageDialog(null, "11. Realizar un algoritmo que, dado un número visualice en pantalla si es par o impar. En el caso de ser 0, debe visualizar “el número no es par ni impar”.");
        JOptionPane.showMessageDialog(null, ejercicio11());
        JOptionPane.showMessageDialog(null, "GRACIAS... !!");

    }
    
    public static String ejercicio3() {
        int num =Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        if(num%2 == 0) return "El numero " + Integer.toString(num) + " es Par";
        else return "El numero " + Integer.toString(num) + " es Impar";
    }
    
    public static String ejercicio4() {
        int num1 =Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        int num2 =Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
        int num3 =Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el tercer numero: "));
        if (num1 > num2) {
            if (num1 > num3) {
                return Integer.toString(num1)+ " es el mayor";
            } else {
                return Integer.toString(num3)+ " es el mayor";
            }
        } else {
            if (num2 > num3) {
                return Integer.toString(num2)+ " es el mayor";
            } else {
                return Integer.toString(num3)+ " es el mayor";
            }
        }
    }
    
    public static String ejercicio5() {
        double altura = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Ingrese la altura: "));
        double radio = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Ingrese el radio: "));
        
        double area = calcularAreaCilindro(altura, radio);
        double volumen = calcularVolumenCilindro(altura, radio);
        return "AREA : " + Double.toString(area) +
                "\nVOLUMEN: " + Double.toString(volumen);
    }
    
    public static double calcularAreaCilindro(double altura, double radio) {
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaBase = Math.PI * radio * altura;
        return 2 * areaBase + areaLateral;
    }
    
    public static double calcularVolumenCilindro(double altura, double radio) {
        return 2 * radio * radio * altura;
    }
    
    public static String ejercicio6() {
        int base = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la base: "));
        int potencia = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la potencia: "));
        int aux = 1;
        int resultado = 1;
        while(aux <= potencia) {
            resultado = resultado * base;
            aux = aux + 1;
        }
        return Integer.toString(base) + " elevado a " + 
                Integer.toString(potencia) + " es " + 
                Integer.toString(resultado);
    }
    
    public static String ejercicio7() {
         int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero: "));
         if(num < 0) return "No se puede obtener la raiz de un numero negativo";
         else return "La raiz cuadrada de: " + Integer.toString(num) +
                 " es: " + Double.toString(sqrt(num));
    }
    
    public static String ejercicio8() {
        int numerador = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el numerador: "));
        int denominador = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el denominador: "));
        if(denominador != 0) return Integer.toString(numerador) + " / " +
                Integer.toString(denominador) + " = " + 
                Double.toString(numerador/denominador);
        else return "No se puede realizar division para CERO";
    }
    
    public static String ejercicio9() {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        if(num < 0) return Integer.toString(num) + " es negativo";
        else if(num == 0) return Integer.toString(num) + " es neutro";
        else return Integer.toString(num) + " es positivo";
    }
    
    public static String ejercicio10() {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el numero"
                        + " que desea calcular el factorial: "));
        int factorial = 1;
        int i = 1;
        while(i <= num) {
            factorial = factorial * i;
            i++;
        }
        return "El factorial de " + Integer.toString(num) +
                " es: " + Integer.toString(factorial);
    }
    
    public static String ejercicio11() {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if(num == 0) return Integer.toString(num) + 
                " no es par ni impar";
        else if(num % 2 == 0) return Integer.toString(num) +
                " es Par";
        else return Integer.toString(num) + 
                " es Impar";
    }
    
}
