/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class PalindromoRecursivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = teclado.nextLine();
        int longitud = palabra.length();
        int posicion = palabra.length() - 1;
        boolean kapikua = comprabarPalindromoRecursivo(palabra, longitud, posicion);
        System.out.println("Es un Palíndromo:? " + kapikua);

    }

    public static boolean comprabarPalindromoRecursivo(String palabra, int longitud1, int longitud2) {
        boolean palindromo = false;
        if (longitud1 < palabra.length()) {
            if (palabra.charAt(longitud1) == palabra.charAt(longitud2 - 1 - longitud1)
                    || longitud1 > longitud2) {
                palindromo = true;
                return comprabarPalindromoRecursivo(palabra, ++longitud1, --longitud2);
            }
        }
        return palindromo;
    }
}
