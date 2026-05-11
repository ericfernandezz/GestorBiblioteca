/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiondebiblioteca;
import java.util.ArrayList; //importar esto
/**
 *
 * @author eric fernandez
 */
public class Biblioteca {

    //Atributo: La colección de materiales
    private ArrayList<MaterialBiblioteca>materiales;

    //Constructor: Crea la lista cuando nace la biblioteca
    public Biblioteca(){ 
        this.materiales = new ArrayList<>();
    }

    //Método para agregar: Recibe cualquier material y lo guarda
    public void agregarMaterial(MaterialBiblioteca m) {
        materiales.add(m);
        System.out.println("Material agregado: " + m.titulo);
    }

    //Listar: Recorre la lista y muestra todo
    public void listarMateriales() {
        if (materiales.isEmpty()) {
            System.out.println("La biblioteca esta vacia.");
        } else {
            for (MaterialBiblioteca m : materiales) {
                System.out.println(m.toString());
            }
        }
    }

    //Buscar: Busca por título y devuelve el objeto (o null si no lo encuentra)
    public MaterialBiblioteca buscarPorTitulo(String titulo) {
        for (MaterialBiblioteca m : materiales) {
            if (m.titulo.equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null; //Si termina el bucle y no encontró nada
    }
    //Prestar: Busca el material y llama a su método prestar()
    public void prestarMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.prestar(); // Aquí se usa el polimorfismo
        } else {
            System.out.println("Error: Material no encontrado.");
        }
    }

    //Devolver: Busca el material y llama a su método devolver()
    public void devolverMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
        } else {
            System.out.println("Error: Material no encontrado.");
        }
    }
}
