/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobles;

/**
 *
 * @author USER
 */
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarOrdenado(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual != null && cliente.getCedula().compareTo(actual.cliente.getCedula()) > 0) {
                actual = actual.siguiente;
            }

            if (actual == cabeza) {
                nuevo.siguiente = cabeza;
                cabeza.anterior = nuevo;
                cabeza = nuevo;
            } else if (actual == null) {
                cola.siguiente = nuevo;
                nuevo.anterior = cola;
                cola = nuevo;
            } else {
                Nodo anterior = actual.anterior;
                anterior.siguiente = nuevo;
                nuevo.anterior = anterior;
                nuevo.siguiente = actual;
                actual.anterior = nuevo;
            }
        }
    }

    public String listarDerecha() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.cliente.toString()).append("\n");
            actual = actual.siguiente;
        }
        return sb.toString();
    }

    public String listarIzquierda() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cola;
        while (actual != null) {
            sb.append(actual.cliente.toString()).append("\n");
            actual = actual.anterior;
        }
        return sb.toString();
    }
}
