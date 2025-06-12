package ingreso.clases;

public class CursoCertificado extends Curso{

        private final double recargo = 1.25;

        public CursoCertificado(String nombre, int duracionSemanas, double precio, String estudiante) {
            super (nombre, duracionSemanas, precio * (1.25), estudiante);
        }

        @Override
        public void mostrarResumen() {
            super.mostrarResumen();
            System.out.println("Este curso incluye certificación.");
        }

        public double calcularPrecioFinal() {
            return precio;
        }
    }
