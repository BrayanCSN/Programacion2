/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author jitof
 */
public class MetodosOrdenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.-Metodo Burbuja \n2.-Metodo Inserccion Directa \n3.-Metodo Selección \n4.-Metodo Shell \n5.-Metodo QuickShort \nSeleccione un metodo: ");
        int n = leer.nextInt();
        System.out.println("¿Cuantos datos desea en el areglo?");
        int n1 = leer.nextInt();

        int arreglo[] = new int[n1];
        Metodos.llenararreglo(arreglo);
        System.out.println("Matriz");
        Metodos.imprimirarreglo(arreglo);

        switch (n) {
            case 1:
                System.out.println(" ");
                Metodos.metodoburbuja(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);

                break;
            case 2:
                System.out.println(" ");
                Metodos.metododirecto(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);

                break;
            case 3:
                System.out.println(" ");
                Metodos.metodoseleccion(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);

                break;
            case 4:    
                System.out.println(" ");
                Metodos.metodoshell(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);

                break;
            case 5:    
                System.out.println(" ");
                Metodos.ordenacionRapida(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);
                
                break;
                
            default:
                System.out.println("Opcion inexistente");
        }
    }
}
