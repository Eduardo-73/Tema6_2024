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
public class NIF {

    public static Random rd = new Random();

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF() {
        this.numero = "" + rd.nextInt(11_111_111, 99_999_999);
        this.letra = calcurarLetra();
        this.fechaCaducidad = LocalDate.now().plusYears(10);
    }

    private static char calcurarLetra() {
        char letra = 0;
        letra = (char) rd.nextInt(65, 90);
        return letra;
    }

    public void renovar(LocalDate fechaSolicitudRenovacion) {
        setFechaCaducidad(fechaSolicitudRenovacion.plusYears(10));
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
