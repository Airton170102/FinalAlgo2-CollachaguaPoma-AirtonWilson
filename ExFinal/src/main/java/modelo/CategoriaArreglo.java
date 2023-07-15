/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class CategoriaArreglo {
    private int indice;
    private Categoria[] categorias;

    public CategoriaArreglo(int tamaño) {
        this.categorias = new Categoria[tamaño];
        this.indice=0;
    }

    public boolean agregarCategoria(Categoria cat) {
        if (indice < categorias.length) {
            categorias[indice++] = cat;
            return true;
        }
        return false;
    }
}