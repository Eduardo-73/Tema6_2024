/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

/**
 *
 * @author edu
 */
public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public Empleado() {
    }

    public abstract double calcularIRPF();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Nº Seguridad Social = ").append(numeroSeguridadSocial);
        sb.append(", Salario = ").append(salario);
        return sb.toString();
    }
}
