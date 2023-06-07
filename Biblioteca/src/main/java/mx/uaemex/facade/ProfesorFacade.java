/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.ProfesorDao;
import mx.uaemex.dto.Profesor;

/**
 *
 * @author jitof
 */
public class ProfesorFacade {
    
    ProfesorDao profesorDao = new ProfesorDao();

   
    public void agregarProfesor(List<Profesor> profesores, Profesor profesor) {
       profesorDao.agregarProfesor(profesores, profesor);
    }

  
    
    public void actualizarProfesor(List<Profesor> profesores, Profesor profesor) {
        profesorDao.actualizarProfesor(profesores, profesor);
    }
    

    public void eliminarProfesor(List<Profesor> profesores, Profesor profesor) {
        profesorDao.eliminarProfesor(profesores, profesor);
    }

  
    public void buscarProfesor(List<Profesor> profesores, Profesor profesor) {
        profesorDao.BuscarProfesor(profesores, profesor);
    }

}