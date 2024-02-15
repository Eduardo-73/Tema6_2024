/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

/**
 *
 * @author edu
 */
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente(Persona cliente, double saldoMin) {
        super(cliente);
        this.interes = 1.5;
        this.saldoMin = saldoMin;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Cliente").append(this.getCliente().getNombre());
        sb.append(", Saldo = ").append(this.getSaldo());
        sb.append(", Interes = ").append(interes);
        sb.append(", Saldo Minimo = ").append(saldoMin);
        return sb.toString();
    }

    @Override
    public void retirar(double dinero) {
        if (!(dinero > saldoMin)) {
            double retirada = this.getSaldo() - dinero;
        }
    }

    @Override
    public void actualizarSaldo() {
        if (this.getSaldo() > 1000) {
            double actualizar = this.getSaldo() + (saldoMin * interes);
        } else {
            double actualizar = this.getSaldo() + (this.getSaldo() + interes);
        }
    }

}
