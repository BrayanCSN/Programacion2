/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Libro;

/**
 *
 * @author jitof
 */
public class LibroDao {
    
    public  List<Libro> libros = new ArrayList<>();

     
    public void AgregarLibro(Libro libro) {
        libros.add(libro);

    }

    public void EliminarLibro(Libro libro) {
        libros.remove(libro);
    }

   public void buscarlibro(List<Libro> libros, Libro libro) {

        
        for (int i = 0; i < libros.size(); i++) {
        
           libro = (Libro) libros.get(i);
            System.out.println(libro.toString());
        }
    }
   

    public Libro BuscarLibroId(List<Libro> libros, int id) {
        Libro libro = new Libro(); 

        for (int i = 0; i < libros.size(); i++) { 
            if (libros.get(i).getId() == id) {
               libro  = libros.get(i); 
                break; 
            }
        }
        return libro;
    }
    
    
        public void  ActualizarLibro(List<Libro> libros, Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                libros.get(i).setNombre(libro.getNombre());
                libros.get(i).setEditorial(libro.getEditorial());

            }
        }
    }
     
    
    public void ImprimirLibro (ArrayList<Libro> libros){
       for (int i = 0; i < libros.size(); i++) {
           System.out.println(libros.get(i).toString());
       
        } 
         
       

    }
}