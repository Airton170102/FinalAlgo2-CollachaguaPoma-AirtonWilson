/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author airto
 */
public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private ProductoArreglo productos;
    private CategoriaArreglo categorias;
    private PersonaArreglo personas;


    Tienda(int tamPersonas, int tamProductos, int tamCategorias) {
        personas = new PersonaArreglo(tamPersonas);
        productos = new ProductoArreglo(tamProductos);
        categorias = new CategoriaArreglo(tamCategorias);
    }

    public void agregarCliente(Cliente c) {
        personas.agregarPersona(c);
    }

    public void agregarCategoria(Categoria cat) {
        categorias.agregarCategoria(cat);
    }

    public void agregarProducto(Producto p) {
        productos.agregarProducto(p);
    }

    Producto[] buscarProductoPorCategoria(Categoria cat){
    
        return null;
    }

    Producto[] buscarProductoPorNombre(String nombre){
       
        return null;
    }

    Persona autenticar(String email, String password){
        
        return null;
    }
}
