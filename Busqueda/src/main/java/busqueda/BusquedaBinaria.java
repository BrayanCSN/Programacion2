/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package busqueda;

import java.util.Arrays;

/**
 *
 * @author jitof
 */
public class BusquedaBinaria {

    public static void main(String[] args) {
        
        int[] numeros = {12, 45, 67, 27, 89, 84, 65, 21, 44};
        int numberToSearch = 45;

        Arrays.sort(numeros);

        if (Arrays.binarySearch(numeros, numberToSearch) > 0) {
            System.out.println("El número " + numberToSearch + " está en el Array");
        } else {
            System.out.println("El número " + numberToSearch + " NO está en el Array");
        }
    }
}
