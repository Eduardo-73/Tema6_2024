/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifo;

/**
 *
 * @author edu
 */
public class Main {

    public static void main(String[] args) {

        Pila p = new Pila();

        p.añadir("Tomas");
        System.out.println(p);
        System.out.println("Número elementos pila: " + p.numElemento());
        p.añadir("Antonio");
        p.añadir("Eduardo");
        System.out.println(p);
        System.out.println("Número elementos pila: " + p.numElemento());
        p.añadir("Aiman");
        System.out.println(p);
        System.out.println("Número elementos pila: " + p.numElemento());
        p.sacarElemento();
        System.out.println(p);
        System.out.println("Número elementos pila: " + p.numElemento());
        p.añadir("Victor");
        p.añadir("Vico");
        p.añadir("Noelia");
        System.out.println(p);
        System.out.println("Número elementos pila: " + p.numElemento());
    }
}
