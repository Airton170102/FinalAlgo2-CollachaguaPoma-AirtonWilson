/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class VentaArreglo {
    private int indice;
    private Venta[] ventas;

    public VentaArreglo(int tamaño) {
        this.ventas = new Venta[tamaño];
        this.indice=0;
    }

    public boolean registrarVenta(Venta v) {
        if(indice < ventas.length) {
            ventas[indice++] = v;
            return true;
        }
        return false;
    }
}
