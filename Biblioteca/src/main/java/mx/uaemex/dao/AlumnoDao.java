/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Alumno;

/**
 *
 * @author jitof
 */
public class AlumnoDao {
    
    public  List<Alumno> alumnos = new ArrayList<>();

     
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);

    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

   public void buscarAlumno(List<Alumno> alumnos, Alumno alumno) {

        System.out.println("Nombre" + "\t\t" + "NumeroCuenta");
        for (int i = 0; i < alumnos.size(); i++) {

            alumno = (Alumno) alumnos.get(i);

        }
    }

    public Alumno buscarAlumnoId(List<Alumno> alumnos, int id) {
        Alumno alumno = new Alumno();

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId() == id) {
                alumno = alumnos.get(i);
                break;
            }
        }
        return alumno;
    }
    
    
        public void  actualizarAlumno(List<Alumno> alumnos, Alumno alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId() == alumno.getId()) {
                alumnos.get(i).setNombre(alumno.getNombre());
                alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
                alumnos.get(i).setGenero(alumno.getGenero());
            }
        }
    }
     
    
    public void imprimirAlumno (ArrayList<Alumno> alumnos){
       for (int i = 0; i < alumnos.size(); i++) {
           System.out.println(alumnos.get(i).toString());
       
        } 
         
       

    }    
}



