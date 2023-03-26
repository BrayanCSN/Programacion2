/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fibonacci;

import static fibonacci.Metodo.fibonacciRecursivo;

/**
 *
 * @author jitof
 */
public class Fibonacci {

    public static void main(String[] args) {
        
        int serie=18;
        for(int i=0;i<serie;i++){
        System.out.println(fibonacciRecursivo(i));    
        }
    }
        
    }