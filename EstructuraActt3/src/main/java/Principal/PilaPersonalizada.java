package Principal;

import Clases.Bala;

public class PilaPersonalizada {

    private Nodo3 raiz;//variable de tipo nodo
    private int numELement;//tamaño de la pila de tipo entero
 
    //constructor vacio
    public PilaPersonalizada() {
        raiz = null;
    }

    //metodo para apilar los objetos en la pila
    public void apilar(Bala adult) {
        Nodo3 nuevo = new Nodo3();
        nuevo.informacion = adult;
        if (raiz == null) {
            nuevo.siguiente = null;
            raiz = nuevo;
        } else {
            nuevo.siguiente = raiz;
            raiz = nuevo;
        }
        numELement++;

    }

    //metodo para desapilar los elementos
    public Bala desapilar() {
        if (raiz != null) {
            Bala infor = raiz.informacion;
            raiz = raiz.siguiente;
            numELement--;
            return infor;
        } else {
            return null;
        }
    }

    //metodo que imprime los elementos de la pila
    public void imprimir() {
        Nodo3 reco = raiz;

        if (raiz != null) {
            while (reco != null) {
                Bala infor = raiz.informacion;
                System.out.println(infor.getNumeroBala() + " - " + infor.getCalibre() + " - " + infor.getPeso() + " - " + infor.getMaterial());
                raiz = raiz.siguiente;
                if (raiz.getSiguiente() == null) {
                    break;
                }
            }
            System.out.println();
        }

    }

    public int tamaño() {
        return numELement;
    }

}




