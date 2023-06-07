/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author jitof
 */
public class PrestamoDao {
        
    public List<Prestamo> prestamos = new ArrayList<>();
    
    public void agregarPrestamo(  Prestamo prestamo) {
       prestamos.add(prestamo);

    }

    public void eliminarPrestamo( Prestamo prestamo) {
      prestamos.remove(prestamo);

    }


 public void buscarPrestamo(List prestamos, Prestamo prestamo) {

        
        for (int i = 0; i < prestamos.size(); i++) {
        
           prestamo = (Prestamo) prestamos.get(i);
            System.out.println(prestamo.toString());
        }
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()) {
                prestamos.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamo> imprimirtListaPrestamos() {
        return prestamos;
      
    }
}