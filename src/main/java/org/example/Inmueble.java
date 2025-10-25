package org.example;
/*
 * author: Genesis Escobar
 * fecha y version: 25/10/2025 version: 1.0
 * descripcion: Clase abstracta que represneta cualquier tipo de inmueble.
 * Es abstracta porque no queremos crear instancias genericas de Inmueble,
 * siempre debe ser un tipo especifico(casa, departamento, local, etc)
 */

abstract class Inmueble {
    //atributos protegidos: accesibles por las clases hijas
    protected int identificadorInmobiliario;
    protected int area; //metros cuadrados
    protected String direccion;
    protected double precioVenta; //se calcula segun area y tipo

    /*
     *Constructor que inicializa los atributos basicos de todo inmueble
     */
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion=direccion;
    }
    /**
     * Metodo que abstracto: cada tipo de inmueble calcula su precio de forma diferente
     * Las clases hijas deben implementar este metodo
     */
    abstract double calcularPrecioVenta();

    /**
     * Metodo que imprime la informacion basica del inmueble
     */
    public void imprimir() {
        System.out.println("Identificador: "+ identificadorInmobiliario);
        System.out.println("Area: "+ area);
        System.out.println("Dirección: "+ direccion);
        System.out.println("Precio Venta: " + String.format("%.2f", precioVenta));
    }

    //Getters y Setters
    public int getIndentificadorInmobiliario() {
        return identificadorInmobiliario;
    }
    public int getArea() {
        return area;
    }
    public String getDireccion() {
        return direccion;
    }
    public double getPrecioVenta () {
        return precioVenta;
    }

}

