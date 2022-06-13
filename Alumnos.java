package Clase11;

public class Alumnos {
    private String nombres;
    private String grado;

    public Alumnos(String nombres, String grado) {
        this.nombres = nombres;
        this.grado = grado;

    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getGrado() {
        return this.grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}
