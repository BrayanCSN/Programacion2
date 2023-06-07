/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dto.Libro;

/**
 *
 * @author jitof
 */
public class LibroFacade {

    LibroDao libroDao = new LibroDao();

    public void create(Libro libro) {
        libroDao.AgregarLibro(libro);
    }

    public void Update(List<Libro> libros, Libro libro) {
        libroDao.ActualizarLibro(libros, libro);
    }

    public void Delete(Libro libro) {
        libroDao.EliminarLibro(libro);
    }

    public void Search(List<Libro> libros, Libro libro) {
        libroDao.buscarlibro(libros, libro);
    }

}
