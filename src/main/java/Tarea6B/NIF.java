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
public class NIF {

    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(long numero, char letra, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = letra;
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF() {
    }

    public static void nif(long num, LocalDate fechaCaducidad) {

    }

    private static char calcurarLetra() {
        char letra = 0;
        return letra;
    }

    public static void renovar(LocalDate fechaSolicitudRenovacion) {

    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nº = ").append(numero);
        sb.append(", Letra = ").append(letra);
        sb.append(", Fecha Caducidad = ").append(fechaCaducidad);
        return sb.toString();
    }

}
