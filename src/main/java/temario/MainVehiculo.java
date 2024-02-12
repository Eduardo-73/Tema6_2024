/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class MainVehiculo {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("123", "456Y", "Citroen", 23.56);
        System.out.println(v1);

        Turismo t1 = new Turismo(8, "888", "999P", "Renault", 10.6);
        System.out.println(t1);

        Furgoneta f1 = new Furgoneta(100.0, "333", "333E",
                "Peugeot", 12.9);

        System.out.println(f1);
        // Cuando uso la variable de la subclase tengo acceso a
        // métodos publicos de la superclase
        t1.descontarTarifa(0);// Este método es de vehiculo
        t1.añadirRuedaRepuesto();// Este método es de turismo
        f1.aumentarCarga(10);// Método propio de furgoneta

        v1.descontarTarifa(0);// Método de Vehiculos

        List<Vehiculo> lista = new ArrayList<>();

        lista.add(v1);
        lista.add(t1);
        lista.add(f1);

        for (Vehiculo v : lista) {
            // Método polimorfico toString
            // En función del tipo al que apunte se ejecuta un código u otro
            System.out.println(v.toString());

            if (v instanceof Turismo) {
                ((Turismo) v).añadirRuedaRepuesto();
            }

            if (v instanceof Furgoneta) {
                ((Furgoneta) v).aumentarCarga(5);
            }

            v.pasarItv();
        }
    }
}
