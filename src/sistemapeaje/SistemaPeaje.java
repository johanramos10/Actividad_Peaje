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
public class SistemaPeaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Peaje peaje = new Peaje ("La Lizama", "Santander");
        Camion camion1 = new Camion("PKI-889", 2);
        peaje.addVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        Camion camion2 = new Camion("KLM-123", 3);
        peaje.addVehiculo(camion2);
        peaje.calcularPeaje(camion2);
        Camion camion3 = new Camion("PQI-234", 4);
        peaje.addVehiculo(camion3);
        peaje.calcularPeaje(camion3);
        Moto moto1 = new Moto("ABC-123");
        peaje.addVehiculo(moto1);
        peaje.calcularPeaje(moto1);
        Moto moto2 = new Moto("XYZ-000");
        peaje.addVehiculo(moto2);
        peaje.calcularPeaje(moto2);
        Carro carro1 = new Carro("WVC-389");
        peaje.addVehiculo(carro1);
        peaje.calcularPeaje(carro1);
        Carro carro2 = new Carro("QWE-543");
        peaje.addVehiculo(carro2);
        peaje.calcularPeaje(carro2);
        peaje.imprimir();

        
    }
}
    

