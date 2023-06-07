/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.test;

import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dao.ProfesorDao;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author EQ_31
 */
public class Test1 {
    
    AlumnoDao alumnoDao = new AlumnoDao();
    LibroDao libroDao = new LibroDao();
    PrestamoDao prestamoDao = new PrestamoDao();
    ProfesorDao profesorDao = new ProfesorDao();

    public void testCrearPrestamo(Prestamo prestamo) {
        prestamoDao.agregarPrestamo(prestamo);
        System.out.println("Fin agregar prestamo");

    }

    public void testCrearLibro(Libro libro) {
        libroDao.AgregarLibro(libro);
        System.out.println("Fin agregar");

    }
    
    
    public void testCrearAlumno(Alumno alumno){
        alumnoDao.agregarAlumno(alumno);
        System.out.println("agregoalumno");
    }

    public void consultarPrestamo() {

        //si es diferente de nulo que se imprima
        //Prestamo p = prestamoDao.BuscarPrestamo(1);
        //System.out.println("Busqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamo> prestamos = prestamoDao.imprimirtListaPrestamos();
        // forech  NombreClase nombreVariaTemporal : nombre de la lista que se recorre
        for (Prestamo p : prestamos) {
            System.out.println(p.toString());
        }

    }

}
