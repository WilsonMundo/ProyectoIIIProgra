/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * 
 * 
 */
public class NodoVehiculo {
    Vehiculo vehiculo;
    NodoVehiculo arriba;
    NodoVehiculo abajo;
    NodoVehiculo izquierda;
    NodoVehiculo derecha;

    public NodoVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        arriba = null;
        abajo = null;
        izquierda = null;
        derecha = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoVehiculo getArriba() {
        return arriba;
    }

    public void setArriba(NodoVehiculo arriba) {
        this.arriba = arriba;
    }

    public NodoVehiculo getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoVehiculo abajo) {
        this.abajo = abajo;
    }

    public NodoVehiculo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoVehiculo izquierda) {
        this.izquierda = izquierda;
    }

    public NodoVehiculo getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoVehiculo derecha) {
        this.derecha = derecha;
    }

    
}
