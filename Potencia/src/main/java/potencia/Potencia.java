/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package potencia;

import java.util.Scanner;
import static potencia.Metodo.potencia;

/**
 *
 * @author jitof
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingresela base");
        int base= leer.nextInt();
        System.out.println("ingrese el exponente");
        int exponente= leer.nextInt();
        leer.close();
        System.out.println("el numero"+ " " + base +" "+"elevado al exponente" +" "+ exponente+ " "+ "es" + " "+ potencia(base,exponente));
    }
}