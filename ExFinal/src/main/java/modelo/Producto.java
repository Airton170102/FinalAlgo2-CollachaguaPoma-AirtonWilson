/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class Producto {
    private float precio;
    private String nombre;
    private int stock;
    private String marca;
    private Categoria categoria;

    public boolean vender(int cantidad) {
        if(stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public boolean reponer(int cantidad) {
        this.stock += cantidad;
        return true;
    }
}
