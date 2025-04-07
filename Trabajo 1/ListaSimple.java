/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.estructuradatos;

/**
 *
 * @author USER
 */
public class ListaSimple {
     private Nodo cabeza;

     //Constructor
    public ListaSimple() {
        this.cabeza = null;
    }
    
    /*Inserta un cliente en la lista de manera ordenada segun su cedula
    Resultado en consola*/
    public void insertarOrdenado(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (cabeza == null || cliente.cedula.compareTo(cabeza.cliente.cedula) < 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null && cliente.cedula.compareTo(actual.siguiente.cliente.cedula) > 0) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
        System.out.println("Cliente insertado correctamente.");
    }
    
    /*Inserta un cliente en la lista de manera ordenada segun su cedula
    Resultado mediante libreria grafica*/
    public void listarClientes() {
        if (cabeza == null) {
            System.out.println("La lista está vacia");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.cliente);
            actual = actual.siguiente;
        }
    }

    public String listarClientesTexto() {
    if (cabeza == null) {
        return "La lista está vacia";
    }

    StringBuilder sb = new StringBuilder();
    Nodo actual = cabeza;

    while (actual != null) {
        sb.append("Cedula: ").append(actual.cliente.cedula)
          .append(", Nombre: ").append(actual.cliente.nombre)
          .append("\n");
        actual = actual.siguiente;
    }

    return sb.toString();
}
}
