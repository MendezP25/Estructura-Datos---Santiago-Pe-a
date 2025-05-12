/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascirculares;
import javax.swing.JOptionPane;

public class ListasCirculares {
    public static void main(String[] args) {
        ListaCircular listaClientes = new ListaCircular();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                MENU
                1. Insertar cliente
                2. Listar clientes
                3. Salir
                """));

            switch (opcion) {
                case 1 -> {
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    listaClientes.insertarCliente(cedula, nombre);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, listaClientes.listarClientes());
                }
                case 3 -> JOptionPane.showMessageDialog(null, "Aplicacion finalizada");
                default -> JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        } while (opcion != 3);
    }
}
