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
public class Paciente extends Persona{

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroHistoria = numeroHistoria;
    }
    
    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Nº Historia = ").append(numeroHistoria);
        return sb.toString();
    } 
}
