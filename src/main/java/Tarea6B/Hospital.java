/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Empleado> emp;
    private List<Paciente> p;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.emp = new ArrayList();
        this.p = new ArrayList();
    }

    public void contratarEmpleado(Empleado emp) {
        System.out.println("El empleado " + emp + " se ha contratado");
        this.emp.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        System.out.println("El paciente " + paciente
                + " ha sido ingresado");
        this.p.add(paciente);
    }

    public List<Paciente> getP() {
        return p;
    }

    public void setP(List<Paciente> p) {
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Empleado> getEmp() {
        return emp;
    }

    public void setEmp(List<Empleado> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(nombre);
        sb.append(", Dirección = ").append(direccion);
        sb.append(", Nº de Camas = ").append(numeroCamas);
        sb.append(", Empleado = ").append(emp);
        sb.append(", Paciente = ").append(p);
        return sb.toString();
    }
}
