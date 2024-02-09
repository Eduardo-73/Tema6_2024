/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author edu
 */
public class EjercicioClase1 {

    public static void main(String[] args) {

        int[] lista = {7, 9, 10, 5, 5, 3, 7, 7, 9, 10, 1, 5, 4};
        System.out.println(contarNumero(lista));
        System.out.println("----------------");
        System.out.println(listaSinDuplicados(lista));

    }

    public static Map<Integer, Integer> contarNumero(int[] array) {
        Map<Integer, Integer> lista = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (lista.containsKey(array[i])) {
                lista.put(array[i], lista.get(array[i]) + 1);
            } else {
                lista.put(array[i], 1);
            }
        }
        return lista;
    }

    public static Set<Integer> listaSinDuplicados(int[] array) {
        Set<Integer> lista = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            lista.add(array[i]);
        }
        return lista;
    }

    public static int buscarElemento(int[] array, int buscar) {
        int numero = 0;
        for (int i = 0; i < array.length; i++) {
            
        }
        return numero;
    }
}
