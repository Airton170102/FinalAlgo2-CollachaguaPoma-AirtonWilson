/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author airto
 */
public class Trabajador extends Persona {

    /**
     *
     * @param text
     * @param text0
     * @return
     */
    public static Trabajador validar(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String password;
    String email;
    static ArrayList<Trabajador> trabajadores = new ArrayList<>();

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }

    public static void crearTrabajadores() {
       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fechaNacimiento = formatoFecha.parse("01/01/1980"); // Fecha de nacimiento por ejemplo
            trabajadores.add(new Trabajador("12345678", "jperez@hotmail.com", "Juan", "Diaz", "Flores", fechaNacimiento, "0000001"));
            trabajadores.add(new Trabajador("12345678", "jdiego@hotmail.com", "Juan", "Jose", "Moreno", fechaNacimiento, "0000002"));
            trabajadores.add(new Trabajador("12345678", "jmoises@hotmail.com", "Juan", "Moises", "Rosales", fechaNacimiento, "0000003"));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha");
        }
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
    
