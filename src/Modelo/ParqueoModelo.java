/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 *
 *
 */
public class ParqueoModelo {
    NodoVehiculo cabeza;
    int maxDerecha = 6;

    public ParqueoModelo() {
        this.cabeza = new NodoVehiculo(null);
    }
    public void Insertar(Vehiculo carro) {
        NodoVehiculo nuevoNodo = new NodoVehiculo(carro);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoVehiculo filaActual = cabeza;
            
            while (filaActual.abajo != null) {
                filaActual = filaActual.abajo;
            }

            NodoVehiculo ultimoEnFila = filaActual;
            int contador = 0;
            /*Contar nodos en la fila hasta alcanzar el máximo permitido o el fin de la fila*/
            while (ultimoEnFila.derecha != null && contador < maxDerecha - 1) {
                ultimoEnFila = ultimoEnFila.derecha;
                contador++;
            }

            if (contador < maxDerecha - 1) {                
                ultimoEnFila.derecha = nuevoNodo;
                nuevoNodo.izquierda = ultimoEnFila;
            } else {
                /* No hay espacio a la derecha, insertar debajo del primer nodo de la fila actual*/
                if (filaActual == cabeza) {
                    
                    while (filaActual.abajo != null) {
                        filaActual = filaActual.abajo; 
                    }
                }                
                filaActual.abajo = nuevoNodo;
                nuevoNodo.arriba = filaActual;
            }
        }
        
    }
    
     public NodoVehiculo buscarPorPlaca(String placa) {
        NodoVehiculo filaActual = cabeza;
        while (filaActual != null) {
            NodoVehiculo nodoActual = filaActual;

            while (nodoActual != null) {
                if (nodoActual.vehiculo != null && nodoActual.vehiculo.getPlaca().equals(placa)) {
                    return nodoActual; 
                }
                nodoActual = nodoActual.derecha; 
            }

            filaActual = filaActual.abajo;  
        }

        return null;  
    }
     public ArrayList<NodoVehiculo> buscarMultiplesCampos(String linea,String color, String propietario,String modelo) {
        NodoVehiculo filaActual = cabeza;
        ArrayList<NodoVehiculo> vehiculos = new ArrayList<>();
        while (filaActual != null) {
            NodoVehiculo nodoActual = filaActual;
            while (nodoActual != null) {
                if (nodoActual.vehiculo != null && (nodoActual.vehiculo.getLinea().equals(linea)||
                        nodoActual.vehiculo.getColor().equals(color)
                        || nodoActual.vehiculo.getPropietario().equals(propietario)
                        || nodoActual.vehiculo.getModelo().equals(modelo))) {
                    vehiculos.add(nodoActual) ; 
                }
                nodoActual = nodoActual.derecha; 
            }

            filaActual = filaActual.abajo;  
        }
        
        return vehiculos;  
    }
     
}
