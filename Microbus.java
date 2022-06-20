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
public class Microbus extends VehiculoPersonas{
    public Microbus(String matricula, int plazas) {
        super(matricula,plazas);
    }
   
    @Override
    public double precioAlquiler(int nDias){
        return super.precioAlquiler(nDias) + 2 * this.getPlazas();
    }
}
