/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Profesor;

/**
 *
 * @author jitof
 */
public class ProfesorDao {
    
    public List<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(List<Profesor> profesores, Profesor profesor) {
        profesores.add(profesor);

    }

    public void actualizarProfesor(List<Profesor> profesores, Profesor profesor) {
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId() == profesor.getId()) {
                profesores.get(i).setNombre(profesor.getNombre());
                profesores.get(i).setApellidoMaterno(profesor.getApellidoMaterno());
                profesores.get(i).setGenero(profesor.getGenero());
            }
        }
    }

    public void eliminarProfesor(List<Profesor> profesores, Profesor profesor) {
        profesores.remove(profesor);
    }

    public void imprimirProfesor(ArrayList<Profesor> profesores) {
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i).toString());

        }
    }

    public Profesor buscarProfesor(ArrayList<Profesor> profesores,int id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor a = profesores.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }
    public void BuscarProfesor(List<Profesor> lista, Profesor profesor) {

        
        for (int i = 0; i < lista.size(); i++) {

            profesor = (Profesor) lista.get(i);
            System.out.println("Nombre" + "\t\t" +                        "NumeroCuenta");
            System.out.println(profesor.getNombre() + "\t\t" + profesor.getApellidoPaterno()+ "\t\t" + profesor.getApellidoMaterno()+ "\t\t" +profesor.getNumeroEmpleado());
        }
    }
}

