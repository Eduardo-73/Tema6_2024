/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6B;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author edu
 */
public class GestionHospital {

    public static void main(String[] args) {

        Random rd = new Random();

        Hospital h = new Hospital("Costa del Sol", "Marbella",
                7);
        for (int i = 0; i < 5; i++) {
            h.contratarEmpleado(crearPersonalPAS());
            if (i > 3) {
                h.contratarEmpleado(crearMedico());
            }
        }

        for (int i = 0; i < 5; i++) {
            h.ingresarPaciente(crearPaciente());
        }

        int indexMedico = rd.nextInt(3, 5);
        int indexPaciente = rd.nextInt(0, 5);

        if (h.getEmp().get(indexMedico) instanceof Medico) {
            ((Medico) h.getEmp().get(indexMedico)).tratar(
                    h.getP().get(indexPaciente),
                    "Paracetamol");
        } else {
            System.out.println("No se ha encontrado ningún medico disponible");
        }

        for (Empleado e : h.getEmp()) {
            System.out.println(e);
            e.calcularIRPF();
        }

        h.getP().get(3).renovarNIF(LocalDate.now());
    }
    public static Scanner teclado = new Scanner(System.in);

    public static Paciente crearPaciente() {
        System.out.print("Intoduce el nombre del paciente: ");
        String nom = teclado.nextLine();
        System.out.print("Intoduce el apellido del paciente: ");
        String ape = teclado.nextLine();
        Paciente p = new Paciente(nom, ape, new NIF());
        return p;
    }

    public static Medico crearMedico() {
        System.out.print("Intoduce el nombre del médico: ");
        String nom = teclado.nextLine();
        System.out.print("Intoduce el apellido del médico: ");
        String ape = teclado.nextLine();
        System.out.print("Intoduce la especialidad médico: ");
        String especialidad = teclado.nextLine();
        System.out.print("Intoduce el salario: ");
        int sal = teclado.nextInt();
        teclado.nextLine();
        Medico m = new Medico(especialidad, sal, nom,
                ape, new NIF());
        return m;
    }

    public static Administrativo crearPersonalPAS() {
        Administrativo a;
        System.out.print("Intoduce el nombre del administrativo: ");
        String nom = teclado.nextLine();
        System.out.print("Intoduce el apellido del administrativo: ");
        String ape = teclado.nextLine();
        System.out.print("Intoduce el salario: ");
        int sal = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Intoduce el grupo al que pertenece el"
                + " administrativo: ");
        String especialidad = teclado.nextLine();
        switch (especialidad) {
            case "C" -> {
                return a = new Administrativo(Grupo.C, sal,
                        nom, ape, new NIF());
            }
            case "D" -> {
                return a = new Administrativo(Grupo.D, sal,
                        nom, ape, new NIF());
            }
            case "E" -> {
                return a = new Administrativo(Grupo.E, sal,
                        nom, ape, new NIF());
            }
        }
        return new Administrativo();
    }
}
