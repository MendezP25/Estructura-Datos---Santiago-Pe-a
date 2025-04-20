/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobles;

/**
 *
 * @author USER
 */
public class Nodo {
     Cliente cliente;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
        this.anterior = null;
    }
}
