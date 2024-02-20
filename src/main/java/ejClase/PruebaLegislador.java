/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class PruebaLegislador {

    public static void main(String[] args) {

        List<Legislador> lista = new ArrayList();

        lista.add(new Diputado(5, "Málaga",
                "PP", "Juanito", "Valderramas"));
        lista.add(new Senador(600, "Galicia",
                "PSOE", "Pepe", "Picapiedras"));
        lista.add(new Diputado(20, "Valencia",
                "PACMA", "María", "de la O"));
        lista.add(new Senador(150, "País Vasco",
                "PNV", "Paxi", "Flores"));
        lista.add(new Alcalde("Madrid", "Madrid", "PP",
                "Tomas", "Aquino"));
        lista.add(new Alcalde("Barcelona", "Cataluña",
                "PSOE", "Antonio", "Lama"));

        for (Legislador l : lista) {
            System.out.println(l);
            if (l instanceof Diputado) {
                System.out.println(((Diputado) l).camara());
            }
            if (l instanceof Senador) {
                System.out.println(((Senador) l).camara());
            }
        }
    }
}
