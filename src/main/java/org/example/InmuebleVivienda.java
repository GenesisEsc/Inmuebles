package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta para inmuebles destinados a vivienda
 * Agrupa caracteristicas comunes de casas y departamentos
 */
abstract class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificador, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Numero de habitaciones: " + numeroHabitaciones);
        System.out.println("Numero de Baños: "+ numeroBanos);

    }
}
