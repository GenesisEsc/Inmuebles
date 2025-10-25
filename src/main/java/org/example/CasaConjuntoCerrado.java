package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Casa en conjunto cerrado urbanizacion con servicios comunes
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    private double valorAdministracion;
    private boolean tienePiscina;
    private boolean tieneCamposDeportivos;
    private static final double VALOR_M2 = 350.0;

    public CasaConjuntoCerrado(int identificador, int area, String direccion, int numHabitaciones, int numBanos, int numPisos,
                               double valorAdmin, boolean piscina, boolean campos) {
        super(identificador, area, direccion, numHabitaciones, numBanos, numPisos);
        this.valorAdministracion = valorAdmin;
        this.tienePiscina = piscina;
        this.tieneCamposDeportivos = campos;
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n---Casa en Conjunto Cerrado---");
        super.imprimir();
        System.out.println("Valor administración: $" + valorAdministracion);
        System.out.println("Tiene piscina: "+ (tienePiscina ? "Si" : "No"));
        System.out.println("Tiene campos deportivos: " + (tieneCamposDeportivos ? "Si" : "No"));
    }
}
