/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author eduar
 */
public abstract class Figura {

    private int base;
    private int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public abstract int calcularArea();

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Base = ").append(base);
        sb.append(", Altura = ").append(altura);
        return sb.toString();
    }

}
