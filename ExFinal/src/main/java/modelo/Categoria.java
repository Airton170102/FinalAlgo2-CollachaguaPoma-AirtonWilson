/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class Categoria {
    private String nombre;
    private boolean disponible;

    public boolean habilitar() {
        this.disponible = true;
        return this.disponible;
    }

    public boolean deshabilitar() {
        this.disponible = false;
        return this.disponible;
    }
}
