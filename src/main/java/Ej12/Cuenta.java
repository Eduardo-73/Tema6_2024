/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

import java.util.Random;

/**
 *
 * @author edu
 */
public abstract class Cuenta {

    private static Random rd = new Random();

    public static Random getRd() {
        return rd;
    }

    public static void setRd(Random aRd) {
        rd = aRd;
    }
    private final String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.numeroCuenta = "" + rd.nextInt(1_111_111, 9_999_999)
                + rd.nextInt(1_111_111, 9_999_999)
                + rd.nextInt(111_111, 999_999);
        this.saldo = 0;
        this.cliente = cliente;
    }

    public abstract void retirar(double dinero);

    public abstract void actualizarSaldo();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append(" Número de Cuenta = ").append(numeroCuenta);
        sb.append(", Saldo = ").append(saldo);
        sb.append(", Cliente = [").append(cliente + "]");
        sb.append('}');
        return sb.toString();
    }

}
