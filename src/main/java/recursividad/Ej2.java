/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author edu
 */
public class Ej2 {

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 8, 1, 9};
        int num = 0;
        int resultado = sumarValoresRecursivos(array, num);
        System.out.println(resultado);
    }

    public static int sumarValoresRecursivos(int[] array, int posicion) {
        int suma = 0;
        if (posicion < array.length) {
            suma += array[posicion];
            posicion++;
            return suma + sumarValoresRecursivos(array, posicion);
        } else {
            System.out.println("\nSe ha excedido el array");
        }

        return suma;
    }
}
