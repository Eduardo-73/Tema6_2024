/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

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
        
        for (Legislador l : lista) {
            System.out.println(l);
            l.getCamara();
        }
    }
}
