package Principal;

import Clases.AdultoMayor;

public class ColaLifoAPila {

    private Nodo2 raiz;//variable de tipo nodo
    private int numElement;//numero de elementos de la coleccion de tipo entero

    //conrtuctor vacio
    public ColaLifoAPila() {
        raiz = null;

    }
    
    //metodo para saber si la coleccion esta vacia
    public boolean esVacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }
     
    //este metodo agrega los elementos a la coleccion
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

    //este metodo elimina los elementos de la coleccion
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
    
    //este metodo imprime los atributos de los objetos en la coleccion
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
