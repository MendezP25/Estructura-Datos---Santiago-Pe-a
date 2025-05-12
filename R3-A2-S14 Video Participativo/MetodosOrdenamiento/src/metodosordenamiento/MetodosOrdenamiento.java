/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosordenamiento;
import java.util.Scanner;

public class MetodosOrdenamiento {

    // Método Burbuja
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método de Inserción (secuencial)
    public static void insercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }

    // Método Quicksort
    public static void quicksort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion - 1);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

    public static int particion(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[derecha];
        arreglo[derecha] = temp;
        return i + 1;
    }

    // Mostrar arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Programa principal con menú
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arregloOriginal = {5, 2, 9, 1, 5, 6};

        int opcion;
        do {
            System.out.println("\n--- Menu de Metodos de Ordenamiento ---");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Secuencial (Insercion)");
            System.out.println("3. Metodo Quicksort");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            int[] arreglo = arregloOriginal.clone(); // Clonar arreglo para no modificar el original

            switch (opcion) {
                case 1:
                    burbuja(arreglo);
                    System.out.print("Arreglo ordenado con Burbuja: ");
                    mostrarArreglo(arreglo);
                    break;
                case 2:
                    insercion(arreglo);
                    System.out.print("Arreglo ordenado con Insercion: ");
                    mostrarArreglo(arreglo);
                    break;
                case 3:
                    quicksort(arreglo, 0, arreglo.length - 1);
                    System.out.print("Arreglo ordenado con Quicksort: ");
                    mostrarArreglo(arreglo);
                    break;
                case 4:
                    System.out.println("Aplicacion finalizada.");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

