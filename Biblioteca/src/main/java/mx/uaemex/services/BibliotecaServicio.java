/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.services;

import java.util.List;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;
import mx.uaemex.dto.Profesor;

/**
 *
 * @author jitof
 */
public interface BibliotecaServicio {
    
    void agregarAlumno (List<Alumno> alumnos, Alumno alumno);
    void actualizarAlumno (List<Alumno> alumnos, Alumno alumno);
    void buscarAlumno (List<Alumno> alumnos, Alumno alumno);
    void eliminarAlumno (List<Alumno> alumnos, Alumno alumno); 
     
    void agregarLibro (List<Libro> libros, Libro libro);
    void actualizarLibro (List<Libro> libros, Libro libro);
    void buscarLibro (List<Libro> libros, Libro libro);
    void eliminarLibro (List<Libro> libros, Libro libro);
    
    void agregarPrestamo ( Prestamo prestamo);
    void actualizarPrestamo ( List<Prestamo> prestamos, Prestamo prestamo);
    void buscarPrestamo ( List prestamos, Prestamo prestamo);
    void eliminarPrestamo (Prestamo prestamo);
    
    void agregarProfesor (List<Profesor> profesores, Profesor profesor);
    void actualizarProfesor (List<Profesor> profesores, Profesor profesor);
    void buscarProfesor (List<Profesor> profesores, Profesor profesor);
    void eliminarProfesor (List<Profesor> profesores, Profesor profesor);
    
}

