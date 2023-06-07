/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author jitof
 */
public class Cola {

    Nodo Frente;
    int tamaño;

    public Cola() {
        Frente = null;
        this.tamaño = 0;
    }

    public boolean isEmpty() {
        return Frente == null;
    }

    public int size() {
        return this.tamaño;
    }

    public Nodo raiz() {
        if (isEmpty()) {
            return null;
        } else {
            return Frente;
        }
    }

    public void sacar() { // método desencolar
        System.out.println("Inicia método sacar ");
        if (Frente != null) {
            System.out.println("Valor sacado " + Frente.getElemento());
            Nodo s = Frente.getSiguiente();
            Frente = s;
        }
        this.tamaño--;
    }

    public void encolar(Nodo nv) {
        if (Frente == null) {
            Frente = nv;
            System.out.println("Valor insertado " + nv.getElemento());
        } else {
            Nodo s = recorreCola();
            if (s.getSiguiente() == null) {
                System.out.println("Valor insertado " + nv.getElemento());
                s.setSiguiente(nv);
                this.tamaño++;
            }
        }
    }

    public Nodo recorreCola() {
        System.out.println("Inicia método recorrer cola");
        System.out.println("Valor visitado " + Frente.getElemento());
        Nodo i = Frente;
        Nodo s = new Nodo(0, null);
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            System.out.println("Valor visitado " + s.getElemento());
            i = s;
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "La cola esta vacía";
        } else {
            String resultado = "";
            Nodo aux = Frente;
//Recorro la pila
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }

}
