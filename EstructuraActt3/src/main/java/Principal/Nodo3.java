
package Principal;

import Clases.AdultoMayor;
import Clases.Bala;


public class Nodo3 {
    
    Bala informacion;//variable de tipo bala
     Nodo3 siguiente;//bariable de tipo nodo
    
    public Nodo3() {
    }
    //constructor que recibe un objeto estudiante
    public Nodo3(Bala info) {
        informacion = info;
        siguiente = null;
    }

    //Setters y Getters
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
