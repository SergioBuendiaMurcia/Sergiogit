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
public class Vehiculo {
    private String matricula;
    private static final int BASE = 50;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double precioAlquiler(int nDias){
        return nDias * BASE;
    }

    @Override
    public String toString() {
        return "Matricula= " + matricula;
    }
    
    
}
