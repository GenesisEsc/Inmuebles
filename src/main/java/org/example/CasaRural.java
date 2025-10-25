package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Casa rural ubicada fuera de la ciudad
 * precio: 200 por m2
 */
public class CasaRural extends Casa {
    private int distanciaCapital;//en kilometros
    private int altitud; //metros sobre el nivel del mar
    private static final double VALOR_M2= 200.0;

    public CasaRural (int identificador, int area, String direccion,
                      int numHabitaciones, int numBanos, int numPisos, int distanciaCapital, int altitud) {
        super(identificador, area, direccion, numHabitaciones, numBanos, numPisos);
        this.distanciaCapital = distanciaCapital;
        this.altitud = altitud;
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n----Casa Rural----");
        super.imprimir();
        System.out.println("Distancia Capital: " + distanciaCapital + "km");
        System.out.println("Altitud: " + altitud + "msnm");
    }

}
