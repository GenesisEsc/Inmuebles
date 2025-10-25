package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Casa independiente casa urbana que no pertenece a un conjunto
 * precio 400 por m2
 */
public class CasaIndependiente extends CasaUrbana {
    private static final double VALOR_M2= 400.0;

    public CasaIndependiente(int identificador, int area, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion, numHabitaciones, numBanos, numPisos);
        this.precioVenta = calcularPrecioVenta();
    }

    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n----Casa Independiente----");
        super.imprimir();
    }
}
