/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author edu
 */
public class Main {

    public static void main(String[] args) {

        List<Trabajador> lista = new ArrayList<>();

        // Añadiendo Trabajadores
        lista.add(new Camarero("Ayudante", "Pepe",
                "Sacamuelas", "123F"));
        lista.add(new Camarero("Barra", "Pepa",
                "Sacacorchos", "123D"));
        lista.add(new Cocinero("Manuel", "Escobar", "123H",
                "Ayudante Cocina"));
        lista.add(new Cocinero("Manuela", "Fandango", "123J",
                "Jefa cocina"));
        lista.add(new Policia("Juana", "De Arco", "123O",
                "RRRRRRRRR3"));

        for (Trabajador t : lista) {
            System.out.println(t);
            t.cotizar();
        }

        Set<CursoReciclado> hacenCursos = new HashSet();
        hacenCursos.add(new Policia());
        hacenCursos.add(new Profesor());

        for (CursoReciclado persona : hacenCursos) {
            persona.hacerCurso(300);
            if (persona instanceof Policia) {
                ((Policia) persona).ponerDenuncias();
            }
        }
    }
}
