package ingreso.clases;

public class Estudiante {
    public int edad;
    public double nota;
    public String nombre;

    public Estudiante(int edad, double nota, String nombre) {
    }

    public boolean validarEdad(int edad) {
        return edad >= 13 && edad <= 60;
    }
    public boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public void mostrarDatos(){
        System.out.println("Edad: " +edad);
        System.out.println("Nota: " +nota);
        System.out.println("Nombre: " +nombre);

    }


}
