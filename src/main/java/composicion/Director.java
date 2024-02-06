/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author edu
 */
public class Director {

    private String nombre;
    private String nif;
    private double sueldo;

    public Director(String nombre, String nif, double sueldo) {
        this.nombre = nombre;
        this.nif = nif;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append(", sueldo=").append(sueldo);
        return sb.toString();
    }

}
