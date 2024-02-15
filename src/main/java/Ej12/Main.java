/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Cuenta> lista = new ArrayList();
        
        CuentaAhorro cA1 = new CuentaAhorro(new Persona("Pepe", "Cañuelas", "123G"),
                2.5, 250.00);
        
        CuentaCorriente cC1 = new CuentaCorriente(new Persona("Pepa", "Garcia", "123P"),
                1100);
        
        lista.add(cA1);
        lista.add(cC1);
        
        for (Cuenta c : lista) {
            System.out.println(c);
            c.setSaldo(2000);
            c.actualizarSaldo();
            System.out.println(c);            
            c.actualizarSaldo();
            c.retirar(500);            
            System.out.println(c);
        }
    }
}
