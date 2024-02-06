/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class Museo { // Clase contenedora

    // Clases contenidas
    private String nombre;
    private String dirPostal;
    private Director director;
    private List<ObraArte> listaObras;

    public Museo(String nombre, String dirPostal, Director director, List<ObraArte> listaObras) {
        this.nombre = nombre;
        this.dirPostal = dirPostal;
        this.director = director;
        this.listaObras = listaObras;
    }
    
    public Museo() {
//        this.nombre = nombre;
//        this.dirPostal = direccion;
        this.nombre = "Reina Sofia";
        this.dirPostal = "Castellana, 23";
        this.director = new Director("Periquito de los palotes", "123", 2000);
        this.listaObras = new ArrayList();
        rellenarListaObras();
    }

    public Museo(String nombre, String direccion) {
        this.nombre = nombre;
        this.dirPostal = direccion;
//        this.nombre = "Reina Sofia";
//        this.dirPostal = "Castellana, 23";
        this.director = new Director("Periquito de los palotes", "123", 2000);
        this.listaObras = new ArrayList();
        rellenarListaObras();
    }

    private void rellenarListaObras() {
        this.listaObras.add(new ObraArte("Guernica", "Pintura"));
    }

    public void añadirObra(ObraArte obra) {
        this.listaObras.add(obra);
    }

    public void quitarObra(ObraArte obra) {
        this.listaObras.remove(obra);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirPostal() {
        return dirPostal;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<ObraArte> getListaObras() {
        return listaObras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", dirPostal=").append(dirPostal);
        sb.append(", director=").append(director);
        sb.append(", listaObras=").append(listaObras);
        sb.append('}');
        return sb.toString();
    }
}
