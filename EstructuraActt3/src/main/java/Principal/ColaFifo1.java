package Principal;

import Clases.Estudiante;

public class ColaFifo1 {

    private Nodo raiz, fondo;//nodos de referencia 
    private int NumElemnet;//tamaño de la cola

    //constructor vacio
    public ColaFifo1() {
        raiz = null;
        fondo = null;
    }

    //metodo para verificar si la lista esta vacia
    public boolean esVacia() {
        if (raiz == null) {//Si la raiz no apunta a ningun elemento devuelve verdadero 
            return true;
        } else {
            return false;
        }
    }

    //metodo para añadir un elemento a la cola
    public void añadir(Estudiante info) {
        Nodo nuevo = new Nodo(info);//se crea un nodo con el objeto ingresado

        if (esVacia()) {
            
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSig(nuevo);
            fondo = nuevo;
        }
        NumElemnet++;//aumenta el numero de elementos si se agrega un objeto
    }

    //metodo para eliminar un elemento
    public Estudiante eliminar() {

        if (!esVacia()) {

            Estudiante informa = raiz.getInfo();
            raiz = raiz.getSig();
            if (raiz == null) {

                fondo = null;
            }

            NumElemnet--;//disminuye el numero de elementos si se agrega un objeto
            return informa;
        } else {
            return null;
        }

    }

    //metodo para conocer el tamaño de la cola
    public int tamaño() {
        return NumElemnet;
    }

    //El metodo imprimir no funciona bien
    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {//si raiz es null quiere decir que la cola est vacia y no entra al bucle
            if (reco.getInfo().getAltura() <= reco.getSig().informnacion.getAltura()) {//compara  si la altura del nodo es menor a la altura del nodo que le sigue

                Estudiante infor = raiz.informnacion;//se guarda el objeto que se encuentra en el nodo en una variable estudiante
                //se imprimen los atributos
                System.out.println(infor.getNombre() + " - " + infor.getApellido() + " - " + infor.getCurso() + " - " + infor.getEdad() + " - " + infor.getAltura());
                raiz = raiz.siguiente;//Se apunta al siguiente no con el objeto guardado

                //verifica que la direccion hacia el siguiente nodo sea nula para romper el bucle 
                if (raiz.siguiente == null) {
                    break;
                }

            } else {
                Estudiante info1 = raiz.informnacion;//variable estudiante con el objeto en el nodo
                Estudiante info2 = raiz.getSig().informnacion;//variable estudiante con el objeto del nodo siguiente 
               
                //imprime los elementos intercambiados 
                System.out.println(info2.getNombre() + " - " + info2.getApellido() + " - " + info2.getCurso() + " - " + info2.getEdad() + " - " + info2.getAltura());
                System.out.println(info1.getNombre() + " - " + info1.getApellido() + " - " + info1.getCurso() + " - " + info1.getEdad() + " - " + info1.getAltura());
                raiz = raiz.getSig().siguiente;//apunta al nodo que le sigue al siguiente 
                if (raiz.getSig().siguiente == null) {//verifica que el nodo despues del siguiente apunte a un nodo vacio y rompe el bucle
                    break;
                }
            }

        }
        System.out.println();
    }

}
