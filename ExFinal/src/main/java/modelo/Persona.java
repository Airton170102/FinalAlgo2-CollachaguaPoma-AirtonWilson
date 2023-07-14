/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author airto
 */
public class Persona {
    String nombre;
    String paterno;
    String materno;
    Date nacimiento;
    String numDocumento;
}

class PersonaArreglo {
    int indice;
    Persona[] personas;

    void agregarPersona(Persona p) {
        if(indice < personas.length) {
            personas[indice++] = p;
        }
    }
}
    
