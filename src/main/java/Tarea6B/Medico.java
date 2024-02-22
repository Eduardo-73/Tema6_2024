/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

/**
 *
 * @author edu
 */
public class Medico extends Empleado implements Nadador {

    private String especialidad;

    public Medico(String especialidad, double salario, String nombre, String apellido, NIF nif) {
        super(salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    public void tratar(Paciente p, String medicina) {
        System.out.println("El médico " + this.getNombre() + " trata al paciente "
                + p + " con la medicina " + medicina);
    }

    @Override
    public double calcularIRPF() {
        double resultado = 0;
        if (this.especialidad.equalsIgnoreCase("cirugia")) {
            return resultado = this.getSalario() * 1.25;
        } else {
            return resultado = this.getSalario() * 1.235;
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNombre());
        sb.append(", Especialidad = ").append(especialidad);
        return sb.toString();
    }

    @Override
    public String nadador() {
        return "Nada";
    }

}
