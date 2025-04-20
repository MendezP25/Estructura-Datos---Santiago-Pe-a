/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobles;

import javax.swing.JOptionPane;

public class ListasDobles {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(
                "Menu de opciones\n" +
                "1. Insertar cliente\n" +
                "2. Listar clientes hacia la derecha\n" +
                "3. Listar clientes hacia la izquierda\n" +
                "4. Salir"
            );

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    if (cedula != null && nombre != null) {
                        Cliente nuevo = new Cliente(cedula, nombre);
                        lista.insertarOrdenado(nuevo);
                        JOptionPane.showMessageDialog(null, "Cliente insertado correctamente.");
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Clientes listados de izquierda a derecha:\n" + lista.listarDerecha());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Clientes listados de derecha a izquierda:\n" + lista.listarIzquierda());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Aplicacion finalizada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }

        } while (!"3".equals(opcion));
    }
}