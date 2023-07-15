/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import controlador.ControladorLogin;
import vista.login1;

/**
 *
 * @author airto
 */
public class ExFinal {

    public static void main(String[] args) {
        ControladorLogin controlador = new ControladorLogin(login1);
        controlador.iniciar();
    }
}
