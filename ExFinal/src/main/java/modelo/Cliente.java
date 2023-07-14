/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
class Cliente extends Persona {
    int celular;
    float dinero;

    boolean pagar() {
   
        return true;
    }

    boolean recargarDinero(float cantidad) {
        this.dinero += cantidad;
        return true;
    }
}