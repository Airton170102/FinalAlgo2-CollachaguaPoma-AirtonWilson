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
    private VentaArreglo ventas;

    public Tienda(String nombre, String ruc, String direccion, ProductoArreglo productos, CategoriaArreglo categorias, PersonaArreglo personas, VentaArreglo ventas) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.productos = productos;
        this.categorias = categorias;
        this.personas = personas;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CategoriaArreglo getCategorias() {
        return categorias;
    }

    public void setCategorias(CategoriaArreglo categorias) {
        this.categorias = categorias;
    }
   

    Tienda(int tamPersonas, int tamProductos, int tamCategorias, int tamVentas) {
        personas = new PersonaArreglo(tamPersonas);
        productos = new ProductoArreglo(tamProductos);
        categorias = new CategoriaArreglo(tamCategorias);
        ventas = new VentaArreglo(tamVentas);
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

    public Producto[] buscarProductoPorCategoria(Categoria cat){
        List<Producto> productosEnCategoria = new ArrayList<>();
        for (int i = 0; i < productos.getCantidad(); i++) {
            Producto producto = productos.getProducto(i);
            if (producto.getCategoria().equals(cat)) {
                productosEnCategoria.add(producto);
            }
        }
        return productosEnCategoria.toArray(new Producto[0]);
    }

    public Producto[] buscarProductoPorNombre(String nombre){
       List<Producto> productosEnNombre = new ArrayList<>();
        for (int i = 0; i < productos.getCantidad(); i++) {
            Producto producto = productos.getProducto(i);
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productosEnNombre.add(producto);
            }
        }
        return productosEnNombre.toArray(Producto[]::new);
    }
    Persona autenticar(String email, String password){
         for (int i = 0; i < personas.getCantidad(); i++) {
            Persona persona = personas.getPersona(i);
            if (persona.getEmail().equals(email) && persona.getPassword().equals(password)) {
                return persona;
            }
        }
        return null;
    }
    public VentaArreglo getVentas() {
        return ventas;
    }
    }
    

