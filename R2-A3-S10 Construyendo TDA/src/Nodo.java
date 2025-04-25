
package modelo;

public class Nodo {
    public Cliente cliente;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
        this.anterior = null;
    }
}
