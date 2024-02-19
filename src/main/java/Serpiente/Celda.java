/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serpiente;

/**
 *
 * @author eduar
 */
public class Celda {

    private int x;
    private int y;

    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append(y);
        return sb.toString();
    }
}
