/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author jitof
 */
public class Elemento {

    String nombre;
    double valor;
    double peso;

    Elemento(String n, double v, double p) {
        nombre = n;
        valor = v;
        peso = p;
    }

    @Override
    public String toString() {
        return String.format("%-15s %,12.2f %,12.2f", nombre, valor, peso);
    }
}
