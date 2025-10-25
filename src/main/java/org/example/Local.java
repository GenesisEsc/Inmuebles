package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta para locales comerciales y oficinas
 */

//enum para el tipo de localizacion del local
enum TipoLocalizacion {
    INTERNO,
    DA_A_LA_CALLE
}
abstract class Local extends Inmueble {
    protected TipoLocalizacion localizacion;

    public Local(int identificador, int area, String direccion,
                 TipoLocalizacion localizacion) {
        super(identificador, area, direccion);
        this.localizacion = localizacion;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Localización: " +
                (localizacion == TipoLocalizacion.INTERNO ? "Interna" : "Da a la calle"));
    }
}
