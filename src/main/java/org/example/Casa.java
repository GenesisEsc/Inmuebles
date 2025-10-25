package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta para casas (rurales o urbanas)
 */
abstract class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificador, int area, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion, numHabitaciones, numBanos);
        this.numeroPisos = numPisos;
    }
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Numero de Pisos: "+ numeroPisos);

    }
}
