
package Clases;

public class Bala {
    //atributos de la clase
    private String numeroBala, calibre, peso, material; 

    //constructor vacio
    public Bala() {
    }

    //constructor con parametros
    public Bala(String numeroBala, String calibre, String peso, String material) {
        this.numeroBala = numeroBala;
        this.calibre = calibre;
        this.peso = peso;
        this.material = material;
    }

    //Setters y Getters
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
