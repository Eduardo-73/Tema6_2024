/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Random;

/**
 *
 * @author edu
 */
public class Ej1 {

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 8, 1, 9};
        int num = 0;
        mostrarValoresRecursivos(array, num);

    }

    public static void mostrarValoresRecursivos(int[] array, int posicion) {
        if (posicion < array.length) {
            System.out.print("[" + array[posicion] + "]" + " ");
            posicion++;
            mostrarValoresRecursivos(array, posicion);
        } else {
            System.out.println("\nSe ha excedido el array");
        }

    }
}
