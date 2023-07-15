/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class ProductoArreglo {
    private int indice;
    private Producto[] productos;
    
    public ProductoArreglo(int tamaño) {
        this.productos = new Producto[tamaño];
        this.indice=0;
    }
    
    public boolean agregarProducto(Producto p) {
        if (indice < productos.length) {
            productos[indice++] = p;
            return true;
        }
        return false;
    }

    int getCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Producto getProducto(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
