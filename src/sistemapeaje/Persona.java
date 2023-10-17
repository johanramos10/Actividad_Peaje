/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapeaje;

import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Yo
 */
public class Persona {
    String nombre;
    String apellido;
    String  documento;
    Date fechaNacimiento;
    public List vehiculos;

    public Persona(String nombre, String apellido, String documento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        vehiculos=new Vector<>();
    }
    
    public void asignarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculos);
    }
    
    public void desasignarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculos);
    }
    
    public  int calcularTotalPeajes(){
        int totalPeajes =0;
        for (Object vehiculo : vehiculos){
            if (vehiculo instanceof Carro){
              totalPeajes +=Carro.valorPeaje;
            }else{
                if(vehiculo instanceof Moto){
                    totalPeajes +=Moto.valorPeaje;
                }else if(vehiculo instanceof Camion){
                    Camion camion =(Camion) vehiculo;
                   totalPeajes += camion.numeroEjes * camion.getValorPeajeEje();
                }
                
            }
        }
        return totalPeajes;
    }

   
   
    

 

}
