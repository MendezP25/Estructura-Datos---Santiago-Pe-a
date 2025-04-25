package controlador;

import modelo.Cliente;
import modelo.ListaDoble;

public class ListaControlador {
    private ListaDoble lista;

    public ListaControlador() {
        lista = new ListaDoble();
    }

    public void agregarCliente(String cedula, String nombre) {
        Cliente cliente = new Cliente(cedula, nombre);
        lista.insertar(cliente);
    }

    public String obtenerListadoDerecha() {
        return lista.listarDerecha();
    }

    public String obtenerListadoIzquierda() {
        return lista.listarIzquierda();
    }
}
