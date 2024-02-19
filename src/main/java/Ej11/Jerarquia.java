/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Jerarquia {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12));
        figuras.add(new Triangulo(10, 5));
        figuras.add(new Romboide(15, 5));
        for (Figura f : figuras) {
            System.out.println("Área: " + f.calcularArea() + "cm2");
        }
    }

}
