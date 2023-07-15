/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class Cliente extends Persona {
    private int celular;
    private float dinero;

    public boolean pagar() {
   
        return true;
    }

    public boolean recargarDinero(float cantidad) {
        this.dinero += cantidad;
        return true;
    }
}