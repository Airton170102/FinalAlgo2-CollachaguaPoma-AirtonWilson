/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author airto
 */
public class Trabajador extends Persona {
    String password;
    String email;
    static ArrayList<Trabajador> trabajadores = new ArrayList<>();

    public Trabajador(String nombre, String numDocumento, String email, String password) {
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.email = email;
        this.password = password;
    }

    public static void crearTrabajadores() {
        trabajadores.add(new Trabajador("Juan Pepe", "0000001", "jperez@hotmail.com", "12345678"));
        trabajadores.add(new Trabajador("Juan Diego", "0000002", "jdiego@hotmail.com", "12345678"));
        trabajadores.add(new Trabajador("Juan Moises", "0000003", "jmoises@hotmail.com", "12345678"));
    }
    public boolean ingresar(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean salir() {
        System.out.println("Trabajador ha salido del sistema.");
        return true;
    }

    public boolean crearVenta(Cliente c) {
             
        return false;       
    }
}
