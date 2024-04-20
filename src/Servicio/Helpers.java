/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * 
 */
public class Helpers {

    public static class validaciones {

        public static boolean esNumero(String valor) {
            if (valor == null || valor.isEmpty()) {
                return false;
            }
            try {
                Double.parseDouble(valor);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

}
