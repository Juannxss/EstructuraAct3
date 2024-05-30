package Principal;

import Clases.Estudiante;

public class Nodo {

    Estudiante informnacion;//variable de tipo estudiante 
    Nodo siguiente;//variable de tipo nodo

    //constructor que recibe un objeto estudiante
    public Nodo(Estudiante info) {
        informnacion = info;
        siguiente = null;
    }

    //Setters y Getters
    public Estudiante getInfo() {
        return informnacion;
    }

    public void setInfo(Estudiante info) {
        this.informnacion = info;
    }

    public Nodo getSig() {
        return siguiente;
    }

    public void setSig(Nodo sig) {
        this.siguiente = sig;
    }

}
