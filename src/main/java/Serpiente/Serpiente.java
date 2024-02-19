/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serpiente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Serpiente {

    public static void main(String[] args) {
        List<Celda> lista = new ArrayList();
        int posicion = 0;
        int[][] serpiente = new int[7][7];
        rellenarMatriz(serpiente);
        mostrarMatriz(serpiente);
        lista = primeraPosicion(serpiente);
        recorrerSerpiente(lista, serpiente, 0);
        System.out.println("\n" + lista);
        mostrarMatriz(serpiente);
    }

    private static void rellenarMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
                matrix[2][2] = 1;
                matrix[2][3] = 1;
                matrix[2][4] = 1;
                matrix[2][5] = 1;
                matrix[3][5] = 1;
                matrix[4][2] = 1;
                matrix[4][3] = 1;
                matrix[4][4] = 1;
                matrix[4][5] = 1;
                matrix[5][2] = 1;
                matrix[6][2] = 1;
            }
        }
    }

    private static void mostrarMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static List<Celda> primeraPosicion(int[][] matrix) {
        List<Celda> lista = new ArrayList();
        boolean encontrado = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    lista.add(new Celda(i, j));
                    matrix[i][j] = -1;
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        return lista;
    }

    private static void recorrerSerpiente(List<Celda> listaCelda, int[][] matrix,
            int posicion) {
        int pX = listaCelda.get(posicion).getX();
        int pY = listaCelda.get(posicion).getY();
        if (posicion <= matrix[0].length) {
            if (matrix[pX - 1][pY] == 1) {// Arriba
                listaCelda.add(new Celda(pX - 1, pY));
                matrix[pX - 1][pY] = -1;
                recorrerSerpiente(listaCelda, matrix, ++posicion);
            }
            if (matrix[pX + 1][pY] == 1) {// Abajo
                listaCelda.add(new Celda(pX + 1, pY));
                matrix[pX + 1][pY] = -1;
                recorrerSerpiente(listaCelda, matrix, ++posicion);
            }
            if (matrix[pX][pY - 1] == 1) {// Izq
                listaCelda.add(new Celda(pX, pY - 1));
                matrix[pX][pY - 1] = -1;
                recorrerSerpiente(listaCelda, matrix, ++posicion);
            }
            if (matrix[pX][pY + 1] == 1) {// Der
                listaCelda.add(new Celda(pX, pY + 1));
                matrix[pX][pY + 1] = -1;
                recorrerSerpiente(listaCelda, matrix, ++posicion);
            }
        }
    }
}
