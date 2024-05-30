package Principal;

import Clases.AdultoMayor;

public class ColaLifo1 {

    private Nodo2 raiz, fondo;//nodos para guardar los elementos
    private int numElement;//tamaño de la cola 

    //constructor vacio
    public ColaLifo1() {
        raiz = null;
        fondo = null;
    }

    //metodo para saber si la lista esta o no vacia
    public boolean esVacia() {
        if (raiz == null) {//verifica si el primer nodo esta vacio y devuelve null de lo contrario devuelve false
            return true;
        } else {
            return false;
        }
    }

    //metodo para agregar un objeto a la lista
    public void añadir(AdultoMayor info) {
        Nodo2 nuevo = new Nodo2(info);
        nuevo.informnacion = info;
        nuevo.siguiente = null;
        if (esVacia()) {
            raiz = nuevo;
            fondo = nuevo;
            numElement++;//aumenta el numero de elementos si se agrega un objeto
        } else {
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
    }

    //este metodo elimina los objetos de la cola
    public AdultoMayor eliminar() {
        if (!esVacia()) {

            AdultoMayor informacion = fondo.informnacion;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                Nodo2 anterior = null;
                Nodo2 actual = raiz;
                while (actual.siguiente != null) {
                    anterior = actual;
                    actual = actual.siguiente;
                }
                anterior.siguiente = null;
                fondo = anterior;
            }
            numElement--;//disminuye el numero de elementos si se agrega un objeto
            return informacion;
        } else {
            return null;
        }
    }
    //este metodo imprime los atributos de los objetos almacenados
    public void imprimir() {
        Nodo2 reco = raiz;
        AdultoMayor adul = new AdultoMayor();
        AdultoMayor adul2 = new AdultoMayor();
        AdultoMayor temp = new AdultoMayor();
        AdultoMayor temp2 = new AdultoMayor();

        adul = reco.informnacion;
        Nodo2 ui = reco.getSig();

        adul2 = ui.informnacion;

        while (reco.getSig() != null) {
            if (adul.getEdad()> adul2.getEdad()) {
                System.out.println(adul.getNombre() + " - " + adul.getApellido() + " - " + adul.getGenero()+ " - " + adul.getEdad() );
                reco = reco.getSig();
                adul = reco.informnacion;
            } else {

                temp = reco.informnacion;
                temp2 = ui.informnacion;
                adul = temp2;
                adul2 = temp;

            }

        }
        System.out.println(adul.getNombre() +" - "+ adul.getApellido() + " - " + adul.getGenero()+ " - " + adul.getEdad() );

    }
    
    public int tamaño (){
        return numElement;
    }
}
