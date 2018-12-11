/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Kevin Canacuan
 */
public class Auto {
    private String placa;
    private String color;
    private String marca;

    public Auto() {
        this.placa = "";
        this.color = "";
        this.marca = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString() {
        return "Placa : " + this.placa + "\nColor : " + this.color + "\nMarca : " + this.marca;
    }
    
    
}
