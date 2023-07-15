/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author airto
 */
public class PersonaArreglo {
    private int indice;
    private Persona[] personas;
    
    public PersonaArreglo(int tamaño){
        this.personas = new Persona[tamaño];
        this.indice=0;   
    
    }
    public void agregarPersona(Persona p) {
        if(indice < personas.length) {
            personas[indice++] = p;
        }
    }

    int getCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Persona getPersona(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
