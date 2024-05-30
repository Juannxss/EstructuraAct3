
package Clases;

public class Bala {
    
    private String numeroBala, calibre, peso, material; 

    public Bala() {
    }

    public Bala(String numeroBala, String calibre, String peso, String material) {
        this.numeroBala = numeroBala;
        this.calibre = calibre;
        this.peso = peso;
        this.material = material;
    }

    public String getNumeroBala() {
        return numeroBala;
    }

    public void setNumeroBala(String numeroBala) {
        this.numeroBala = numeroBala;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
    
}
