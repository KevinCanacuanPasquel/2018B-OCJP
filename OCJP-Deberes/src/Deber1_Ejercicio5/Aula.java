/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1_Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author kfc0_
 */
public class Aula {
    private int identificador;
    private int numeroMaximoEst;
    private String materiaAsignada;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public Aula() {
        this.identificador = generarIdentificador();
        this.numeroMaximoEst = generarNumeroMaximoEst();
        this.materiaAsignada = generarMateriaAsignada();
        this.profesor = new Profesor();
        generarEstudiantes();
    }

    public Aula(int identificador, int numeroMaximoEst, String materiaAsignada, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        this.identificador = identificador;
        this.numeroMaximoEst = numeroMaximoEst;
        this.materiaAsignada = materiaAsignada;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getNumeroMaximoEst() {
        return numeroMaximoEst;
    }

    public void setNumeroMaximoEst(int numeroMaximoEst) {
        this.numeroMaximoEst = numeroMaximoEst;
    }

    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public void setMateriaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    //-----------------------------------------------------------------
    
    public int generarIdentificador() {
        return (int) ((Math.random() * 9000) + 100);
    }
    
    public int generarNumeroMaximoEst() {
        return (int) ((Math.random() * 15) + 20);
    }
    
    public String generarMateriaAsignada() {
        int aux = (int) (Math.random() *2);
        return Materias.values()[aux].nombre;
    }
    
    private void generarEstudiantes() {
        for(int i = 0; i < this.numeroMaximoEst; i++) {
            this.estudiantes.add(new Estudiante());
        }
    }
    
    //----------------------------------------------------------------
    
    public boolean puedeDarClase() {
        if(this.profesor.getProbabilidadAsistencia() == 1) {
            if(this.profesor.getMateria().equals(this.materiaAsignada)) {
                int aux = 0;
                for (Estudiante estudiante : estudiantes) {
                    if(estudiante.getProbabilidadAsistencia() == 1) {
                        aux++;
                    }
                }
                return aux > (numeroMaximoEst / 2);
            }
        }
        return false;
    }
    
    private int getNumeroEstudiantesHombres() {
        int aux = 0;
        for(Estudiante estudiante : estudiantes) {
            if(estudiante.getGenero() == 'H' && estudiante.getCalificacion() > 7) {
                aux++;
            }
        }
        return aux;
    }
    
    private int getNumeroEstudiantesMujeres() {
        int aux = 0;
        for(Estudiante estudiante : estudiantes) {
            if(estudiante.getGenero() == 'M' && estudiante.getCalificacion() > 7) {
                aux++;
            }
        }
        return aux;
    }
    
    @Override
    public String toString() {
        return "Aula " + this.identificador +
                "\nMateria Aula: " + this.materiaAsignada +
                "\nNumero Maximo de Estudiantes: " + this.numeroMaximoEst +
                "\n\nProfesor: " + this.profesor +
                "\nNumero de Estudiantes Aprobados:" +
                "\n\tMUJERES: " + getNumeroEstudiantesMujeres() +
                "\n\tHOMBRES: " + getNumeroEstudiantesHombres();
    }
    
}
