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
public class Estudiante {
    private long cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private int edad;

    public Estudiante() {
        this.cedula = 0;
        this.nombre = "";
        this.apellido = "";
        this.genero = "";
        this.direccion = "";
        this.edad = 0;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString() {
        return "Cedula: " +  this.cedula +
                "\nNombre: " + this.nombre +
                "\nApellido: " + this.apellido +
                "\nGenero: " + this.genero +
                "\nDireccion: " + this.direccion +
                "\nEdad: " + this.edad;
    }
    
}
