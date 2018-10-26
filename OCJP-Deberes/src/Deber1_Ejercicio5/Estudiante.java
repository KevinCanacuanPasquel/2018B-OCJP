/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio5;

/**
 *
 * @author kfc0_
 */
public class Estudiante extends Persona {
    
    private int calificacion;

    public Estudiante() {
        super();
        this.calificacion = generarCalificacion();
    }

    public Estudiante(String nombre, int edad, char genero, int calificacion) {
        super(nombre, edad, genero);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public int generarCalificacion() {
        return (int) ((Math.random() * 7) + 3);
    }
    
    @Override
    public int getProbabilidadAsistencia() {
        return Math.random() > 0.5 ? 1 : 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCalificacion: " + this.calificacion;
    }
    
}
