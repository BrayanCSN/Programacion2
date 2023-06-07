/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author jitof
 */
public class PrestamoFacade {
    
    PrestamoDao prestamoDao = new PrestamoDao();
    
    
    public void Create(Prestamo prestamo) {
       prestamoDao.agregarPrestamo(prestamo);
    }

   public void Search(List prestamos, Prestamo prestamo) {
       prestamoDao.buscarPrestamo(prestamos, prestamo);
   }
    
    public void Update(List<Prestamo> prestamos, Prestamo prestamo) {
       prestamoDao.actualizarPrestamo(prestamo);
    }
    
    public void Delete(Prestamo prestamo) {
        prestamoDao.eliminarPrestamo(prestamo);
    }
}

