package Clase11;

public class Main {
    public static void main(String args[]) {

        System.out.println();

        Alumnos alumno1 = new Alumnos("Javier Morales", "5to de primaria");

        Director director = new Director("Fabiano", 34212334);

        Docente docente = new Docente("nombre", 12457839);

        Colegio colegio = new Colegio("Proceres de la Independencia", "jr.Rejalagar 128 SJL");

        System.out.println("Nombre del colegio: " + colegio.getNombre());
        System.out.println("Direccion del colegio: " + colegio.getDireccion());
        System.out.println();
        System.out.println("Nombre del director: " + director.getNombre());
        System.out.println("Dni del director: " + director.getDni());
        System.out.println();
        System.out.println("Nombre del docente: " + docente.getNombre());
        System.out.println("Dni del docente: " + docente.getDni());
        System.out.println();
        System.out.println("Nombre del alumno: " + alumno1.getNombres());
        System.out.println("Grado del alumno: " + alumno1.getGrado());
        System.out.println();

    }
}
