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
public class PalindromoIterativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = teclado.nextLine();
        int posicion = palabra.length() - 1;
        boolean kapikua = false;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) == palabra.charAt(posicion - i)) {
                kapikua = true;
                break;
            }
        }
        System.out.println("La palabra es kapikua?: " + kapikua);
    }
}
