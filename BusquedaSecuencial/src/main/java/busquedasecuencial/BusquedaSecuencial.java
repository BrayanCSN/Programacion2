/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package busquedasecuencial;

import java.util.Scanner;

/**
 *
 * @author jitof
 */
public class BusquedaSecuencial {

    public static void main(String[] args) {
        int[] numeros = {23, 43, 1, 5, 2, 22, 32, 78};
        Scanner leer = new Scanner(System.in);
        boolean existe = false;

        System.out.println("ingrese el número a buscar!");
        int numBuscado = leer.nextInt();

        for (int b = 0; b < numeros.length; b++) {

            if (numeros[b] == numBuscado) {

                System.out.println("el numero si existe, en la posicion " + (b + 1));
                break;
            }
            if (b == numeros.length - 1) {
                existe = true;
            }
        }
        if (existe == true) {

            System.out.println("el numero no existe");
        }
    }
}
