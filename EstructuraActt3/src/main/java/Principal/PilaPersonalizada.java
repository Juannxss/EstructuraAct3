package Principal;

import Clases.Bala;

public class PilaPersonalizada {

    private Nodo3 raiz;
    private int numELement;

    public PilaPersonalizada() {
        raiz = null;
    }

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

    // No funciona del todo
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
