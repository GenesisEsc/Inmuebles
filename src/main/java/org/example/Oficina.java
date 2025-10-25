package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Oficina espacio para trabajos administrativos
 * precio 450 por m2
 */
public class Oficina extends Local{
    private boolean esGobierno;
    private static final double VALOR_M2 = 450.0;

    public Oficina(int identificador, int area, String direccion,
                   TipoLocalizacion localizacion, boolean esGobierno) {
        super(identificador, area, direccion, localizacion);
        this.esGobierno = esGobierno;
        this.precioVenta = calcularPrecioVenta();
    }
    @Override
    double calcularPrecioVenta() {
        return area * VALOR_M2;
    }
    @Override
    public void imprimir() {
        System.out.println("\n---Oficina---");
        super.imprimir();
        System.out.println("Es del gobierno: " + (esGobierno ? "Si" : "No"));
    }
}
