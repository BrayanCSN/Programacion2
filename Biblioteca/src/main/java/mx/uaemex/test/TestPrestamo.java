/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author jitof
 */
public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(2);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setIsbn(344);
        libro2.setStock(2);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Hernadez");
        alumno1.setApellidoMaterno("Ruiz");
        alumno1.setNumeroCuenta(20227102);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        Date fechaEnt = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setFechaentrega(fechaEnt);
        prestamo1.setEstatus("Proceso");
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);

        Libro libro3 = new Libro();
        libro3.setId(3);
        libro3.setNombre("El perfume");
        libro3.setCategoria("Drama,Misterio");
        libro3.setEditorial("Alfaomega");
        libro3.setIsbn(2589);
        libro3.setStock(5);
        Libro libro4 = new Libro();
        libro4.setId(4);
        libro4.setNombre("El principito");
        libro4.setCategoria("Fantasia");
        libro4.setEditorial("Alfaomega");
        libro4.setIsbn(3284);
        libro4.setStock(2);
        Libro libro5 = new Libro();
        libro5.setId(5);
        libro5.setNombre("Diario de Ana Frank");
        libro5.setCategoria("Historia");
        libro5.setEditorial("Alfaomega");
        libro5.setIsbn(584184);
        libro5.setStock(8);
        List<Libro> listaLibros1 = new ArrayList<>();
        listaLibros1.add(libro3);
        listaLibros1.add(libro4);
        listaLibros1.add(libro5);
        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("Jorge");
        alumno2.setApellidoPaterno("Torrecilla");
        alumno2.setApellidoMaterno("Osorio");
        alumno2.setNumeroCuenta(284892);

        Prestamo prestamo2 = new Prestamo();
        Date fechaIni1 = new Date();
        Date fechaEnt1 = new Date();
        prestamo2.setId(2);
        prestamo2.setFolio(321);
        prestamo2.setFechainicio(fechaIni1);
        prestamo2.setFechaentrega(fechaEnt1);
        prestamo2.setEstatus("Proceso");
        prestamo2.setLibros(listaLibros1);
        prestamo2.setPersona(alumno2);

        Libro libro6 = new Libro();
        libro6.setId(6);
        libro6.setNombre("Jack El destripador");
        libro6.setCategoria("Terror,suspenso");
        libro6.setEditorial("Alfaomega");
        libro6.setIsbn(2211);
        libro6.setStock(8);

        List<Libro> listaLibros3 = new ArrayList<>();
        listaLibros3.add(libro6);

        Alumno alumno3 = new Alumno();
        alumno3.setId(3);
        alumno3.setNombre("Fernanda");
        alumno3.setApellidoPaterno("Gonzales");
        alumno3.setApellidoMaterno("Islas");
        alumno3.setNumeroCuenta(294851);

        Prestamo prestamo3 = new Prestamo();
        Date fechaIni3 = new Date();
        Date fechaEnt3 = new Date();
        prestamo3.setId(3);
        prestamo3.setFolio(279);
        prestamo3.setFechainicio(fechaIni3);
        prestamo3.setFechaentrega(fechaEnt3);
        prestamo3.setEstatus("Proceso");
        prestamo3.setLibros(listaLibros3);
        prestamo3.setPersona(alumno3);

        Test1 test1 = new Test1();
        test1.testCrearLibro(libro1);
        test1.testCrearLibro(libro2);
        test1.testCrearLibro(libro3);
        test1.testCrearLibro(libro4);
        test1.testCrearLibro(libro5);
        test1.testCrearLibro(libro6);
        test1.testCrearAlumno(alumno1);
        test1.testCrearAlumno(alumno2);
        test1.testCrearAlumno(alumno3);
        test1.testCrearPrestamo(prestamo1);
        test1.testCrearPrestamo(prestamo2);
        test1.testCrearPrestamo(prestamo3);

        test1.consultarTodos();
        //test1.consultarPrestamo();
    }
}
