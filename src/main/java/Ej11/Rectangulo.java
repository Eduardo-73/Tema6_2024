/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author eduar
 */
public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        int resultado = super.getBase() * super.getAltura();
        return resultado;
    }

}
