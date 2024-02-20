/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author edu
 */
public abstract class Legislador {

    private String provincia;
    private String patidoPolitico;

    public Legislador(String provincia, String patidoPolitico) {
        this.provincia = provincia;
        this.patidoPolitico = patidoPolitico;
    }

    public Legislador() {
    }
    
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
        sb.append("Provincia = ").append(provincia);
        sb.append(", Patido Político = ").append(patidoPolitico);
        return sb.toString();
    }
}
