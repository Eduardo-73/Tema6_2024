/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

/**
 *
 * @author eduar
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro(Persona cliente, double interes, double comisionAnual) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = this.comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getCliente().getNombre());
        sb.append(", Saldo = ").append(this.getSaldo());
        sb.append(" Interes = ").append(interes);
        sb.append(", Comisión Anual = ").append(comisionAnual);
        return sb.toString();
    }

    @Override
    public void retirar(double dinero) {
        if (this.getSaldo() > dinero) {
            double retirar = this.getSaldo() - dinero;
        }
    }

    @Override
    public void actualizarSaldo() {
        double actualizar = (this.getSaldo() + (this.getSaldo() * interes))
                - comisionAnual;
    }

}
