package Clases;

public class Estudiante {

    private String nombre, apellido, curso;
    private int edad;
    private float altura;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, int edad, float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
