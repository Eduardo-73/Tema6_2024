/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class Pila {

    private List<String> pila;
    private final int TAMANIO = 5;
    
    public Pila() {
        this.pila = new ArrayList(TAMANIO);
    }

    public boolean llena() {
        if (this.pila.size() == TAMANIO) {
            return true;
        } else {
            return false;
        }
    }

    public void añadir(String elemento) {
        if (!llena()) {
            this.pila.add(0, elemento);
        }
    }

    public void sacarElemento() {
        this.pila.remove(0);
    }

    public boolean vacia() {
        return this.pila.isEmpty();
    }

    public int numElemento() {
        return this.pila.size();
    }

    public List<String> getPila() {
        return pila;
    }

    public void setPila(List<String> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila = ").append(pila);
        return sb.toString();
    }

}
