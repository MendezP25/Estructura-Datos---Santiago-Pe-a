/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascirculares;

public class ListaCircular {
    private Nodo inicio = null;
    private Nodo ultimo = null;

    public void insertarCliente(String cedula, String nombre) {
        Cliente nuevoCliente = new Cliente(cedula, nombre);
        Nodo nuevoNodo = new Nodo(nuevoCliente);

        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.siguiente = inicio;
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = inicio;
            ultimo = nuevoNodo;
        }
    }

    public String listarClientes() {
        if (inicio == null) {
            return "La lista está vacia.";
        }

        StringBuilder resultado = new StringBuilder("Clientes:\n");
        Nodo actual = inicio;

        do {
            resultado.append(actual.cliente.toString()).append("\n");
            actual = actual.siguiente;
        } while (actual != inicio);

        return resultado.toString();
    }
}
