package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta para casas urbanas (pueden ser en conjunto cerrado o independiente)
 */
abstract class CasaUrbana extends Casa {
    public CasaUrbana(int identificador, int area, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion, numHabitaciones, numBanos, numPisos);
    }
}
