package Clase11;

public class Docente {
    private String nombre;
    private int dni;

    public Docente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
