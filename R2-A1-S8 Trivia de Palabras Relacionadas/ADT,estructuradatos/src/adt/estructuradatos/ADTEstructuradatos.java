
package adt.estructuradatos;

import javax.swing.JOptionPane;

public class ADTEstructuradatos {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        int opcion;
        
        do {
            String input = JOptionPane.showInputDialog(
                null,
                "----- MENU -----\n" +
                "1. Insertar cliente\n" +
                "2. Listar clientes\n" +
                "3. Salir\n\n" +
                "Seleccione una opcion:"
            );

            if (input == null) {
                // Usuario cancelo el cuadro de dialogo
                break;
            }

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción invalida. Intente nuevamente");
                continue;
            }

            switch (opcion) {
                case 1:
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
                    if (cedula == null) break;

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    if (nombre == null) break;

                    lista.insertarOrdenado(new Cliente(cedula, nombre));
                    break;

                case 2:
                    String listaClientes = lista.listarClientesTexto(); // Debes implementar este método
                    JOptionPane.showMessageDialog(null, "--- Lista de Clientes ---\n" + listaClientes);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Aplicación finalizada.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida. Intente nuevamente.");
            }

        } while (true);
    }
}