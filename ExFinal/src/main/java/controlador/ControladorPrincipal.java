/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Trabajador;
import modelo.PersonaArreglo;
import vista.login1;
import vista.PagPrincipal;

/**
 *
 * @author AULAFISI
 */
public class ControladorPrincipal {
    Trabajador modelo;
    PagPrincipal vista;

    public ControladorPrincipal(Trabajador modelo, PagPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.lblUsuario.setText("Usuario:"+ modelo.getNombre());
        
        this.vista.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                login1 fIngreso = new login1();
                ControladorLogin controlador;
                controlador = new ControladorLogin(main.ExFinal.trabajadores, PagPrincipal);
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
        
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
