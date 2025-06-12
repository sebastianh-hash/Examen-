package ingreso.clases;

public class Curso {
        public String nombre;
        public int duracionSemanas;
        public double precio;
        public String docente;
        public int estudiante;

        public Curso(String nombre, int duracionSemanas, double precio, String estudiante) {
            this.nombre = nombre;
            this.duracionSemanas = duracionSemanas;
            this.precio = precio;
        }



    public void asignarDocente(String docente) {
            this.docente = docente;
        }
public String estudiante(){
    return "";
}

        public void mostrarResumen() {
            System.out.println("Curso: " + nombre);
            System.out.println("Duración: " + duracionSemanas + " semanas");
            System.out.println("Precio: $" + precio);
            System.out.println("Docente asignado: ");
            System.out.println("Estudiante: ");
        }
    }



