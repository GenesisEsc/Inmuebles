package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: departamento de una sola habitacion
 * precio 200 por m2
 */
public class Apartaestudio extends Departamento {
    private static final double VALOR_M2 = 200.0;
    private static final int HABITACIONES = 1; //siempre tiene 1 habitacion

    public Apartaestudio(int identificador, int area, String direccion, int numBanos, double valorAdmin) {
        //forzamos 1 habitacion porque es apartaestudio
        super(identificador, area, direccion, HABITACIONES, numBanos, valorAdmin);
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n---Apartaestudio---");
        super.imprimir();
    }
}
