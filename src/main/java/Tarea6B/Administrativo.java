/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

/**
 *
 * @author edu
 */
public class Administrativo extends Empleado {

    Grupo grupo;

    public Administrativo(Grupo grupo, double salario, String nombre,
            String apellido, NIF nif) {
        super(salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    public Administrativo() {
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println("El documento ha sido registrado por: "
                + this.getNombre() + this.getApellido() + ". El nombre del "
                + "documento es: " + nombreDoc + "con el código: "
                + nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {
        double resultado = 0;
        if (this.grupo == this.grupo.C) {
            return resultado = this.getSalario() * this.grupo.C.getIrpf();
        } else if (this.grupo == this.grupo.D) {
            return resultado = this.getSalario() * this.grupo.D.getIrpf();
        } else {
            return resultado = this.getSalario() * this.grupo.E.getIrpf();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNombre());
        sb.append(", Grupo = ").append(grupo.getIrpf());
        return sb.toString();
    }
}
