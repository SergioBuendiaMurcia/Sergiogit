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
public class VehiculoPersonas extends Vehiculo{
    private int plazas;
    public VehiculoPersonas(String matricula, int plazas) {
        super(matricula);
        this.plazas  = plazas;
    }
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    @Override
    public double precioAlquiler(int nDias){
       return super.precioAlquiler(nDias) + (1.5 * nDias * plazas);
    }

    @Override
    public String toString() {
        return super.toString() + " plazas=" + plazas;
    }
    
}
