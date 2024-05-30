package Principal;

import Clases.AdultoMayor;

public class Nodo2 {

    AdultoMayor informnacion;//variable de tipo adulto mayor
    Nodo2 siguiente;//variable de tipo nodo
    //constructor que recibe un objeto adulto mayor
    public Nodo2(AdultoMayor info) {
        informnacion = info;
        siguiente = null;
    }
    
    //Setters y Getters
    public AdultoMayor getInfo() {
        return informnacion;
    }

    public void setInfo(AdultoMayor info) {
        this.informnacion = info;
    }

    public Nodo2 getSig() {
        return siguiente;
    }

    public void setSig(Nodo2 sig) {
        this.siguiente = sig;
    }

}
