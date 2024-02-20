/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase;

/**
 *
 * @author edu
 */
public class Diputado extends Legislador implements DiputadorSenador {

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String patidoPolitico,
            String nombre, String apellidos) {
        super(provincia, patidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Número Asiento = ").append(numeroAsiento);
        return sb.toString();
    }

    @Override
    public String camara() {
        return "Diputado";
    }

}
