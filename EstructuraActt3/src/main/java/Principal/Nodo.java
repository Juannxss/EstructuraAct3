
package Principal;

import Clases.Estudiante;

public class Nodo {
    
    Estudiante informnacion;
    Nodo siguiente;

    public Nodo(Estudiante info) {
        informnacion = info;
        siguiente = null;
    }

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
