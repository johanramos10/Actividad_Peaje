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
    public List<Vehiculo> vehiculos;

    public Persona(String nombre, String apellido, String documento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        vehiculos=new Vector<>();
    }
    
    public void asignarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void desasignarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    
    public  int calcularTotalPeajes(){
        int totalPeajes =0;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo instanceof Carro){
              totalPeajes +=((Carro) vehiculo).getValorPeaje();
            }else if(vehiculo instanceof Moto){
                    totalPeajes +=((Moto) vehiculo).getValorPeaje();
            }else if(vehiculo instanceof Camion){
                    Camion camion =(Camion) vehiculo;
                   totalPeajes += camion.numeroEjes * camion.getValorPeajeEje();
                }
                
            
        }
        return totalPeajes;
    }

   
   
    

 

}
