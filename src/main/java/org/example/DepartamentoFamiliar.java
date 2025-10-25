package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: departamento familiar con multiples habitaciones
 * precio 300 por m2
 */
public class DepartamentoFamiliar extends Departamento {
    private static final double VALOR_M2 = 300.0;

    public DepartamentoFamiliar(int identificador, int area, String direccion,
                                int numHabitaciones, int numBanos, double valorAdmin) {
        super(identificador, area, direccion, numHabitaciones, numBanos, valorAdmin);
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n--.Departamento Familiar---");
        super.imprimir();
    }
}
