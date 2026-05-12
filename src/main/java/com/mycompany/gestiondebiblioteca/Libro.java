/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondebiblioteca;

/**
 *
 * @author kathy577
 */
public class Libro extends MaterialBiblioteca implements Prestable {
    private String autor;
    
   //constructor: recibe titulo,año y autor.Llama a la clase madre
    public Libro (String titulo, int anio , String autor){
        super(titulo,anio);
        this.autor = autor;
    
    }
    
    //Metodos donde se cambia el estado 
    @Override
    public void prestar(){
        if (!prestado){
            prestado =true;
            System.out.println("Este libro: " + titulo + " ha sido prestado");
        }
        else
        {
            System.out.println("Este libro: " + titulo + " ya esta prestado");
        }
        
    }
    
    
    @Override 
    public void devolver(){
        if (prestado){
            prestado = false;
            System.out.println("Este libro: " + titulo + "ha sido devuelto");
        }
        else 
        {
            System.out.println("Este libro : " + titulo + " no estaba prestado");
        }
    }
    
    //Devolucion de informacion del libro
    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | Anio: " + anio + " | Estado: " + (prestado ? "Prestado" : "Disponible");
    }
    
}
