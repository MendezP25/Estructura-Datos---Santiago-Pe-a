package modelo;

import java.util.StringJoiner;

public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }

    // Metodo para insertar un cliente al final de la lista
    public void insertar(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Metodo para listar de izquierda a derecha
    public String listarDerecha() {
        StringJoiner sj = new StringJoiner("\n");
        Nodo actual = cabeza;
        while (actual != null) {
            sj.add(actual.cliente.toString());
            actual = actual.siguiente;
        }
        return sj.toString();
    }

    // Metodo para listar de derecha a izquierda
    public String listarIzquierda() {
        StringJoiner sj = new StringJoiner("\n");
        Nodo actual = cola;
        while (actual != null) {
            sj.add(actual.cliente.toString());
            actual = actual.anterior;
        }
        return sj.toString();
    }
}
