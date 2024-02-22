/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author edu
 */
public class Paciente extends Persona implements Nadador {

    public static Random rd = new Random();

    private String numeroHistoria;

    public Paciente(String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroHistoria = "" + rd.nextInt(1_111_111, 9_999_999);
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

    @Override
    public String nadador() {
        return "Nada";
    }
}
