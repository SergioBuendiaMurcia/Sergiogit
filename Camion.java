/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerVehiculos;

/**
 *
 * @author Susana Rosa <susana.rosa@murciaeduca.es>
 */
public class Camion extends VehiculoCarga{
    public Camion(int pma, String matricula) {
        super(pma,matricula);
      
    }
   
    @Override
    public double precioAlquiler(int nDias){
         return super.precioAlquiler(nDias) + 40;
    }
            
}
