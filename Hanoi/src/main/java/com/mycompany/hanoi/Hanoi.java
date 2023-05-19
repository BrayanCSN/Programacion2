/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hanoi;

import static com.mycompany.hanoi.Metodo.Hanoi;
import java.util.Scanner;

/**
 *
 * @author EQ_31
 */
public class Hanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n, 1, 2, 3);  //1:origen  2:auxiliar 3:destino                                                         
    }
}
