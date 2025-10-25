package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta para departamentos
 */
abstract class Departamento extends InmuebleVivienda{
    protected double valorAdministracion;

    public Departamento(int identificador, int area, String direccion,
                        int numHabitaciones, int numBanos, double valorAdmin) {
        super(identificador, area, direccion, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdmin;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor Administración: $" + valorAdministracion);
    }
}
