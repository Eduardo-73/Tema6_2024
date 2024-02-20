/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase;

/**
 *
 * @author edu
 */
public class Senador extends Legislador implements DiputadorSenador {

    private double complemento;

    public Senador(double complemento, String provincia, String patidoPolitico, String nombre, String apellidos) {
        super(provincia, patidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }
    
    public int compareTo(Senador o) {
        return Double.compare(this.complemento, o.complemento);
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Complemento = ").append(complemento);
        return sb.toString();
    }

    @Override
    public String camara() {
        return "Senador";
    }
}
