/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author edu
 */
public abstract class Legislador extends Persona {

    private String provincia;
    private String patidoPolitico;

    public Legislador(String provincia, String patidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.patidoPolitico = patidoPolitico;
    }

    public Legislador(String provincia, String patidoPolitico) {
        this.provincia = provincia;
        this.patidoPolitico = patidoPolitico;
    }

    public Legislador() {
    }

    public static void legistador() {
        System.out.println("Soy legislador");
    }

    public abstract void getCamara();

    public String getPatidoPolitico() {
        return patidoPolitico;
    }

    public void setPatidoPolitico(String patidoPolitico) {
        this.patidoPolitico = patidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Provincia = ").append(provincia);
        sb.append(", Patido Político = ").append(patidoPolitico);
        return sb.toString();
    }
}
