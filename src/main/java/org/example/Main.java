package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase principal para pruebas con los objetos
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║         SISTEMA DE GESTIÓN DE INMUEBLES        ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        //crear diferentes tipos de inmuebles
        CasaRural casaRural = new CasaRural(1, 150,
                "Jardines de Granada",
                3,2,1,45, 2200);
        CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(2, 120,
                "Conjunto Bellavista #2",
                4, 3, 2, 250000, true, true);
        CasaIndependiente casaIndep = new CasaIndependiente(3, 200,
                "Puente 8", 5, 4, 2);

        Apartaestudio aparta = new Apartaestudio(4, 35,
                "Edificio Central Apto 302",
                1, 80000);

        DepartamentoFamiliar deptoFam = new DepartamentoFamiliar(5, 85,
                "Torre Norte Apto 1205",
                3, 2, 150000);

        LocalComercial local = new LocalComercial(6, 50,
                "Centro Comercial Plaza Mayor L-23",
                TipoLocalizacion.INTERNO,
                "Plaza Mayor");

        Oficina oficina = new Oficina(7, 75, "Edificio Empresarial Piso 8",
                TipoLocalizacion.DA_A_LA_CALLE, false);

        //imprimir info de todos los inmuebles
        casaRural.imprimir();
        casaConjunto.imprimir();
        casaIndep.imprimir();
        aparta.imprimir();
        deptoFam.imprimir();
        local.imprimir();
        oficina.imprimir();

        //demostrar polimorfismo: todos son inmuebles
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║       RESUMEN DE PRECIOS                          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        Inmueble[] inmuebles = {casaRural, casaConjunto, casaIndep,
                aparta, deptoFam, local, oficina};

        double total = 0;
        for (Inmueble inmueble : inmuebles) {
            System.out.printf("ID %d - $%.2f%n",
                    inmueble.getIdentificadorInmobiliario(),
                    inmueble.getPrecioVenta());
            total += inmueble.getPrecioVenta();
        }
        System.out.println("──────────────────────────────────────────────────");
        System.out.printf("VALOR TOTAL DEL PORTAFOLIO: $%.2f%n", total);

        }
    }
