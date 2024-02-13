/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author edu
 */
public class Policia extends Trabajador implements CursoReciclado{

    private String numeroPlaca;

    public Policia(String nombre, String apellido1, String NIF, String numeroPlaca) {
        super(nombre, apellido1, NIF);
        this.numeroPlaca = numeroPlaca;
    }
    
    public Policia(){
        
    }
    
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(this.getNombre());
        sb.append(", Número de Placa = ").append(numeroPlaca);
        return sb.toString();
    }

    public void ponerDenuncias() {
        System.out.println("Poniendo una Receta");
    }

    @Override
    public void cotizar() {
        System.out.println("Estoy cotizando como Policia");
    }

    @Override
    public void hacerCurso(int numeroHoras) {
        if(numeroHoras > 200){
            System.out.println("Subir sueldo del policía");
        }
    }
}
