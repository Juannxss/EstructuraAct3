package Principal;

import Clases.AdultoMayor;

public class ColaLifoAPila {

    private Nodo2 raiz;
    private int numElement;

    public ColaLifoAPila() {
        raiz = null;

    }

    public boolean esVacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void añadir(AdultoMayor info) {
        Nodo2 nuevo = new Nodo2(info);
        nuevo.informnacion = info;

        if (esVacia()) {
            nuevo.siguiente = null;
            raiz = nuevo;

        } else {
            nuevo.siguiente = raiz;
            raiz = nuevo;
        }
        numElement++;
    }

    public AdultoMayor eliminar() {
        if (esVacia()) {

            AdultoMayor informacion = raiz.informnacion;
            raiz = raiz.siguiente;
            numElement--;
            return informacion;
        } else {
            return null;
        }
    }

    public void imprimir() {
        Nodo2 reco = raiz;
        if (raiz != null) {
            while (reco != null) {
                AdultoMayor infor = raiz.informnacion;
                System.out.println(infor.getNombre() + " - " + infor.getApellido() +" - " + infor.getGenero() + " - "+ infor.getEdad());
                raiz = raiz.siguiente;
                if (raiz.getSig() == null) {
                    break;
                }

            }
            System.out.println();
        }
    }

    public int tamaño() {
        return numElement;

    }
}
