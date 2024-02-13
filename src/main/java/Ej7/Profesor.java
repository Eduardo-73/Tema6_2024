/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author edu
 */
public class Profesor extends Trabajador implements CursoReciclado {

    @Override
    public void cotizar() {
        System.out.println("Cotizando como Profesor ");
    }

    @Override
    public void hacerCurso(int numeroHoras) {
        System.out.println("Muy bien, aunque sea de 2 horas,"
                + " te voy a subir el sueldo");
    }

}
