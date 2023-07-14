/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
class Trabajador extends Persona {
    String password;
    String email;

    boolean ingresar(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    boolean salir() {
    
        return true;
    }

    boolean crearVenta(Cliente c) {
     
        return true;
    }
}