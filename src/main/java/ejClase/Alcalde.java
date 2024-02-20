/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase;

/**
 *
 * @author edu
 */
public class Alcalde extends Legislador {

    private String ciudad;

    public Alcalde(String ciudad, String provincia, String patidoPolitico, String nombre, String apellidos) {
        super(provincia, patidoPolitico, nombre, apellidos);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Ciudad=").append(ciudad);
        return sb.toString();
    }

}
