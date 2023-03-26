/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author jitof
 */
public class Metodo {
    
    public static int fibonacciRecursivo(int n){
           
    if (n==0){
    return 0;

    } else if(n==1){
    return 1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
    else{
    return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);    
    }
}
}

