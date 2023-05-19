/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ackermann;

import static com.mycompany.ackermann.Metodo.ackerman;
import java.util.Scanner;

/**
 *
 * @author EQ_31
 */
public class Ackermann {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int m=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n=leer.nextInt();
        System.out.println("El valor Ackerman es: " + ackerman(m,n));
        
    }
}
