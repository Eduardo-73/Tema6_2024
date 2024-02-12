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
        int posicion = palabra.length() - 1;
        boolean kapikua = comprabarPalindromoRecursivo(palabra, 0, posicion);
        System.out.println("Es un Palíndromo:? " + kapikua);

    }

    public static boolean comprabarPalindromoRecursivo(String palabra,
            int inicio, int fin) {
        boolean palindromo = false;
        if (inicio >= fin) {
            return palindromo = true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return palindromo;
        }
        return comprabarPalindromoRecursivo(palabra, ++inicio, --fin);
    }
}
