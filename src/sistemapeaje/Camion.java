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
public class Camion extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por un camión
    private static int valorPeajeEje = 5000;
    // Atributo que identifica el número de ejes que tiene un camión
    public int numeroEjes;
    
   public Camion(String placa, int numeroEjes) {
        super(placa); // Invoca al constructor de la clase padre
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
   
   
    /**
    * Método que devuelve el valor del peaje para un camión
    * @return El valor del peaje para un camión
    */
    public int getValorPeajeEje() {
        return valorPeajeEje;
    }
    /**
    * Método que establece el valor del peaje para un camión
    * @param Parámetro que define el valor del peaje para un camión
    */
    static void setValorPeajeEje(int valorPeajeEje) {
        valorPeajeEje = valorPeajeEje;
    }
    /**
    * Método que muestra en pantalla la placa, el número de ejes y el
    * valor del peaje de un camión
    */
    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Número de ejes = " + numeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}
