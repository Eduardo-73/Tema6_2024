/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

import java.util.Random;

/**
 *
 * @author edu
 */
public class Moneda extends Azar{
    
    public static Random rd = new Random();
    
    @Override
    public int lanzar() {
        return this.posibilidades = rd.nextInt(1,3);
    }
    
    
}
