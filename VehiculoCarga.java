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
public class VehiculoCarga extends Vehiculo{
    private int pma;

    public VehiculoCarga(int pma, String matricula) {
        super(matricula);
        this.pma = pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
 
    @Override
    public double precioAlquiler(int nDias){
         return super.precioAlquiler(nDias) + (20 * pma);
    }

    @Override
    public String toString() {
        return super.toString()+" PMA= " + pma ;
    }
    
}
