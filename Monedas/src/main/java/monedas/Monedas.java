/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package monedas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author jitof
 */
public class Monedas {

    public static void main(String[] args) {
        Monedas ap;
        ap=new Monedas();

        ap.cambio(); //llamamos al metodo principal
    }

    public void cambio(){
        int[] Billetes={200, 100, 50, 20, 10,5,2,1}; //billetes disponibles en el cajero
        ArrayList Solucion = new ArrayList(); //conjunto solucion/ billetes devueltos

        int retiro=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Monto")); //solicitar el monto a retirar
        int x=0; //billete seleccionado para devolver
        int i=0; //contador
        int acum=0; //acumula los billetes devueltos
        int dif=retiro; //diferencia en cada retiro respecto al monto solicitado

        if(retiro<=3000){ //verificamos el maximo retiro que se puede solicitar (ej. 3000)
            while(acum != retiro){ //mientras los billetes hasta ahora devueltos no cumplan el valor solicitado...
                dif=dif-x; //se acumula la diferencia
                x=seleccionar(Billetes, dif); //eleccion del billete adecuado y guardar -> revisar en linea 48
                acum=acum+x; //guarda el billete elegido
                Solucion.add(x); //agregar al conjunto solucion
                i++;
            }
            for (int j = 0; j<Solucion.size(); j++) { //recorrido e impresion del conjunto solución
                System.out.println(Solucion.get(j));
            }

        }
    }

    int seleccionar(int[] Bill, int dif){ //metodo de eleccion del billete ideal
        int aux=0;

        for (int j = 0; j < Bill.length; j++) { //recorrido de los billetes disponibles
            if(Bill[j]<=dif){ //si es menor que la cantidad por devolver
                aux=Bill[j]; //guardar billete ideal
                break;
            }
        }
        return aux; //-> revisar linea 36
    }

}