
package Principal;

import Clases.AdultoMayor;

public class Nodo2 {
    
    
     
    AdultoMayor informnacion;
    Nodo2 siguiente;

    public Nodo2(AdultoMayor info) {
        informnacion = info;
        siguiente = null;
    }

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
