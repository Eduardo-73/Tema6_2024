/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

import java.time.LocalDate;

/**
 *
 * @author edu
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private NIF nif;

    public Persona(String nombre, String apellido, NIF nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public Persona() {
        
    }
    
    public static void renovarNIF(LocalDate fechaSolicitud){
        
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(nombre);
        sb.append(", Apellido = ").append(apellido);
        return sb.toString();
    }

}
