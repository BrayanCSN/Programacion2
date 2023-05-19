/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Random;

/**
 *
 * @author jitof
 */
public class Metodos {

    public static int[] metodoburbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {

                //comparamos el valor de x es mayor a la posicion que esta adelante
                if (arreglo[j] > arreglo[j + 1]) {
                    //guardamos en una variable nuestro valor j
                    int aux = arreglo[j];
                    //cambiamos el valor de j+1 por el mismo que j
                    arreglo[j] = arreglo[j + 1];
                    //cambiamos el valor de j+1 por el que guardamos en aux
                    arreglo[j + 1] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }
            System.out.println(" ");
        }
        return arreglo;

    }

    public static int[] metodoseleccion(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posiciÃģn buscamos en el resto del arreglo algÃšn elemento menor que el actual
            si hay alguno menor se intercambia  */

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }
        }
        return arreglo;
    }

    public static int[] metododirecto(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posiciÃģn buscamos en el resto del arreglo algÃšn elemento menor que el actual
            si hay alguno menor se intercambia  */

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");

                System.out.print(arreglo[j] + " ");
            }

        }
        return arreglo;
    }

    public static int[] metodoshell(int arreglo[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < arreglo.length; i++) // se da una pasada
                {
                    if (arreglo[i - salto] > arreglo[i]) {       // y si están desordenados
                        aux = arreglo[i];                  // se reordenan
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
        return arreglo;
    }
    
    public static void ordenacionRapida(int arreglo[]) {
        final int N = arreglo.length;
        quickSort(arreglo, 0, N - 1);
    }

    public static void quickSort(int arreglo[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int pivote = arreglo[inicio];
        int Izq = inicio + 1;
        int Der = fin;
        while (Izq <= Der) {
            while (Izq <= fin && arreglo[Izq] < pivote) {
                Izq++;
            }
            while (Der > inicio && arreglo[Der] >= pivote) {
                Der--;
            }
            if (Izq < Der) {
                int temp = arreglo[Izq];
                arreglo[Izq] = arreglo[Der];
                arreglo[Der] = temp;
            }
        }

        if (Der > inicio) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[Der];
            arreglo[Der] = temp;
        }
        quickSort(arreglo, inicio, Der - 1);
        quickSort(arreglo, Der + 1, fin);
    }

    public static int[] llenararreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }

    public static void imprimirarreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.valueOf(arreglo[i]) + " ");
        }
    }
}
