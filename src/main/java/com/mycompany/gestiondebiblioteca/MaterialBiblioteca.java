/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondebiblioteca;

/**
 *
 * @author eric fernandez
 */
public abstract class MaterialBiblioteca implements Prestable { 
    
    protected String titulo;
    protected int anio;
    protected boolean prestado;

    public MaterialBiblioteca(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = false; 
    }

    //métodos abstractos
    public abstract void prestar(); 
    public abstract void devolver();

    @Override
    public String toString() {
        String estado = (prestado) ? "Prestado" : "Disponible";
        return "Titulo: " + titulo + " | Anio: " + anio + " | Estado: " + estado;
    }
}
