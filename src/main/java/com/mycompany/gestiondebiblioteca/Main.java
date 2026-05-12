/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondebiblioteca;

/**
 *
 * @author Simon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu Biblioteca ---");
            System.out.println("1) Agregar libro");
            System.out.println("2) Listar materiales");
            System.out.println("3) Buscar por titulo");
            System.out.println("4) Prestar material");
            System.out.println("5) Devolver material");
            System.out.println("6) Salir");
            System.out.print("Elija una opcion: ");

            // Validación de entrada
            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Ingrese un numero.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese anio: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = sc.nextLine();
                    Libro libro = new Libro(titulo, anio, autor);
                    biblioteca.agregarMaterial(libro);
                    break;

                case 2:
                    biblioteca.listarMateriales();
                    break;

                case 3:
                    System.out.print("Ingrese titulo a buscar: ");
                    String buscar = sc.nextLine();
                    MaterialBiblioteca encontrado = biblioteca.buscarPorTitulo(buscar);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontro el material.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese titulo a prestar: ");
                    String prestar = sc.nextLine();
                    biblioteca.prestarMaterial(prestar);
                    break;

                case 5:
                    System.out.print("Ingrese titulo a devolver: ");
                    String devolver = sc.nextLine();
                    biblioteca.devolverMaterial(devolver);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
