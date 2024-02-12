/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author edu
 */
public class Cocinero extends Trabajador {

    private String rango;

    public Cocinero(String nombre, String apellido1, String NIF, String rango) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    public void cocinando() {
        System.out.println("El cocinero esta cocinando");
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

}
