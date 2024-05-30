
package Principal;

import Clases.AdultoMayor;
import Clases.Bala;


public class Nodo3 {
    
    Bala informacion;
     Nodo3 siguiente;
    
    public Nodo3() {
    }

    public Nodo3(Bala info) {
        informacion = info;
        siguiente = null;
    
    
    }

    public Bala getInformacion() {
        return informacion;
    }

    public void setInformacion(Bala informacion) {
        this.informacion = informacion;
    }

    public Nodo3 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo3 siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
