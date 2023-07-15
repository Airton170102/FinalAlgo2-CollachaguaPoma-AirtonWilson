/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class Trabajador extends Persona {
    String password;
    String email;

    public boolean ingresar(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean salir() {
    
        return true;
    }

    public boolean crearVenta(Cliente c) {
     
        return true;
    }
}