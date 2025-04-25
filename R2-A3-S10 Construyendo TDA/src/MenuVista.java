package vista;

import controlador.ListaControlador;

import javax.swing.JOptionPane;

public class MenuVista {
    private ListaControlador controlador;

    public MenuVista() {
        controlador = new ListaControlador();
    }

    public void mostrarMenu() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    "Menú de Opciones\n" +
                    "1. Insertar Cliente\n" +
                    "2. Listar Clientes (De izquierda a derecha)\n" +
                    "3. Listar Clientes (De derecha a izquierda)\n" +
                    "4. Salir\n" +
                    "Ingrese una opcion:");

            switch (opcion) {
                case "1":
                    insertarCliente();
                    break;
                case "2":
                    listarDerecha();
                    break;
                case "3":
                    listarIzquierda();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Aplicacion finalizada");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida. Intente nuevamente.");
            }
        } while (!"4".equals(opcion));
    }

    private void insertarCliente() {
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        if (cedula != null && nombre != null && !cedula.isEmpty() && !nombre.isEmpty()) {
            controlador.agregarCliente(cedula, nombre);
            JOptionPane.showMessageDialog(null, "Cliente insertado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos.");
        }
    }

    private void listarDerecha() {
        String lista = controlador.obtenerListadoDerecha();
        JOptionPane.showMessageDialog(null, lista.isEmpty() ? "Lista vacia." : lista, "Clientes (Izquierda, Derecha)", JOptionPane.INFORMATION_MESSAGE);
    }

    private void listarIzquierda() {
        String lista = controlador.obtenerListadoIzquierda();
        JOptionPane.showMessageDialog(null, lista.isEmpty() ? "Lista vacia." : lista, "Clientes (Derecha, Izquierda)", JOptionPane.INFORMATION_MESSAGE);
    }
}
