/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dto.Alumno;

/**
 *
 * @author jitof
 */
public class AlumnoFacade {
    
    AlumnoDao alumnoDao= new AlumnoDao();
               
    public void create(Alumno alumno){
        alumnoDao.agregarAlumno(alumno);
}
    public void Delete(Alumno alumno){
        alumnoDao.eliminarAlumno(alumno);
}
    public void Search(List<Alumno> alumnos, Alumno alumno){
        alumnoDao.buscarAlumno(alumnos,alumno);
    }
    public void Update(List<Alumno> alumnos, Alumno alumno){
        alumnoDao.actualizarAlumno(alumnos,alumno);
}
}

