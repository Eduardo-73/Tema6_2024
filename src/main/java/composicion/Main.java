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
public class Main {

    public static void main(String[] args) {
//        Museo museo = new Museo();
//        System.out.println(museo);
//        museo.añadirObra(new ObraArte("Monalisa", "Pintura"));
//        System.out.println(museo);
        List<ObraArte> lista = new ArrayList();
        lista.add(new ObraArte("Guernica", "Pintura"));
        Museo reinaSofia = new Museo(
                "Reina Sofía", "Castellana, 23",
                new Director("Pepe", "123", 2000), lista);
        System.out.println(reinaSofia);
    }
}
