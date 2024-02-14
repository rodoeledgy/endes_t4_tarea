package org.Main;
import java.util.*;

/**
 * Date: 08/02/24
 * Author: Rodo
 */
public class Concesionario {



    private ArrayList<Auto> autos;


    /**
     * Constructor de la clase Concesionario, crea un array list donde se
     * almacenarán los autos
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }


    /**
     * @param auto a agregar a la lista
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }


    /**
     * @return ArrayList de los autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }


    /**
     * Printea por pantalla todos los autos de la arrayList
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }

}
