/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author airto
 */
public class Venta {
    float total;
    Date fecha;
    boolean estado;
    Cliente cliente;
    Trabajador trabajador;
    List<Detalle> detalles = new ArrayList<>();

    public boolean agregarProducto(Producto p) {
        Detalle detalle = new Detalle();
        detalle.producto = p;
        detalles.add(detalle);
        return true;
    }

    public boolean eliminarProducto(Producto p, int cantidad) {
        // implementar lógica
        return true;
    }

    public float validarCarrito() {
        float total = 0f;
        for (Detalle detalle : detalles) {
            total += detalle.total;
        }
        return total;
    }
}
