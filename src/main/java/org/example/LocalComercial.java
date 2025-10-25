package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Local comercial tienda o negocio
 * precio 400 por m2
 */
public class LocalComercial extends Local {
    private String centroComercial;
    private static final double VALOR_M2 = 400.0;

    public LocalComercial(int identificador, int area, String direccion,
                          TipoLocalizacion localizacion, String centroComercial) {
        super(identificador, area, direccion, localizacion);
        this.centroComercial = centroComercial;
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n---Local Comercial ---");
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
