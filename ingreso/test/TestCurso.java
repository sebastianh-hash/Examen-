package ingreso.test;

import ingreso.clases.*;

public class TestCurso {
    public static void main(String[] args) {
            Curso curso1 = new Curso("Matemáticas", 2, 100,"Juan alberto cataño");
            curso1.asignarDocente("Prof. García");
        Estudiante estudiante1 = new Estudiante(17,6, "Ernesto Suarez");
        estudiante1.mostrarDatos();
            curso1.mostrarResumen();


            CursoCertificado curso2 = new CursoCertificado("Programación Java", 12, 150, "Rocio Flores");
            curso2.asignarDocente("Dr. Mendoza");
        Estudiante estudiante= new Estudiante(18, 7, "Juan perez");
        estudiante.mostrarDatos();
            curso2.mostrarResumen();





        }


    }

