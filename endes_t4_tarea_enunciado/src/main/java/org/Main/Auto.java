package org.Main;



/**
 * Date: 08/02/24
 * Author: Rodo
 */
public class Auto {



    private String marca;
    private String modelo;


    /**
     *
     * @param String con el nombre de la marca del auto
     * @param String con el nombre del modelo del auto
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    /**
     *
     * @return String con el nombre de la marca
     */
    public String getMarca() {
        return marca;
    }


    /**
     *
     * @param String marca a asignar
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     *
     * @return String con el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }


    /**
     *
     * @param String modelo con el modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     * @return String con los datos de la clase Auto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
