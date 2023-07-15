/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Trabajador;
import vista.login1;
import vista.PagPrincipal;

public class ControladorLogin {
    Trabajador modelo;
    login1 vista;

    public ControladorLogin(Trabajador modelo, login1 vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trabajador u = Trabajador.ingresar(vista.txtUsuario.getText(), String.valueOf(vista.txtClave.getPassword()));
                if (u != null){
                    PagPrincipal vistaP = new PagPrincipal();
                    ControladorPrincipal controladorPrincipal = 
                            new ControladorPrincipal(u, vistaP);
                    controladorPrincipal.iniciar();
                    vista.dispose();
                } else {
                    JOptionPane.showMessageDialog(vista, "Credenciales inválidas");
                }
                limpiarControles();
            }
        });
    }

    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtClave.setText("");
        vista.txtUsuario.setText("");
    }
}