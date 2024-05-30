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
        Nodo nuevo = new Nodo(info);

        if (esVacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSig(nuevo);
            fondo = nuevo;
        }
        NumElemnet++;
    }
 
    //metodo para eliminar un elemento
    public Estudiante eliminar() {

        if (!esVacia()) {

            Estudiante informa = raiz.getInfo();
            raiz = raiz.getSig();
            if (raiz == null) {

                fondo = null;
            }

            NumElemnet--;
            return informa;
        } else {
            return null;
        }

    }

    public int tamaño() {
        return NumElemnet;
    }

    //El metodo imprimir no funciona bien
   

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            if (raiz != null) {
                
                
                if (reco.getInfo().getAltura() <= reco.getSig().informnacion.getAltura()) {

                    Estudiante infor = raiz.informnacion;
                    System.out.println(infor.getNombre()+" - "+infor.getApellido()+" - "+infor.getCurso()+" - "+infor.getEdad() +" - "+infor.getAltura());
                    raiz = raiz.siguiente;

                    if (raiz.siguiente == null) {
                        break;
                    }

                } else  {
                    Estudiante info1 = raiz.informnacion;
                    Estudiante info2 = raiz.getSig().informnacion;
                    

                    System.out.println(info2.getNombre()+" - "+info2.getApellido()+" - "+info2.getCurso()+" - "+info2.getEdad() +" - "+info2.getAltura());
                    System.out.println(info2.getNombre()+" - "+info2.getApellido()+" - "+info2.getCurso()+" - "+info2.getEdad() +" - "+info2.getAltura());
                     raiz = raiz.getSig().siguiente;
                    if ( raiz.getSig().siguiente==null) {
                        break;
                    }
                }
               
            }

        }
        System.out.println();
    }

}
