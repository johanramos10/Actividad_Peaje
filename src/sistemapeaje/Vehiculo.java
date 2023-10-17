/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapeaje;

/**
 *
 * @author Yo
 */
abstract public class Vehiculo {
    
    public String placa; // Atributo que define la placa de un vehículo
    
    /**
    * Constructor de la clase Vehículo
    * @param placa Parámetro que define la placa de un vehículo
    */
    Vehiculo(String placa) {
        this.placa = placa;
    }

   
}

