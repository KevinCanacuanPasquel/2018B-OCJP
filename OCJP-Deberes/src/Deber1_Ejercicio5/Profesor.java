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
public class Profesor extends Persona {
    private String materia;

    public Profesor() {
        super();
        this.materia = generarMateria();
    }

    public Profesor(String materia, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String generarMateria() {
        int aux = (int) (Math.random() * 2);
        return Materias.values()[aux].nombre;
    }

    @Override
    public int getProbabilidadAsistencia() {
        return Math.random() < 0.8 ? 1 : 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nMateria: " + this.materia;
    }
    
}
