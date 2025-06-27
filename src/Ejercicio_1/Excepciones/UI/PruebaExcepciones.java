package Ejercicio_1.Excepciones.UI;

public class PruebaExcepciones {
    public static void main(String[] args) {
        try {
            System.out.println("Ingresando al primer try");
            double cociente = 1000/0;
            System.out.println("Después de la división");
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } finally {
            System.out.println("Ingresando al primer finally");
        }

        try {
            System.out.println("Ingresando al segundo try");
            Object obj = null;
            obj.toString();
            System.out.println("Imprimiendo objeto");
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } finally {
            System.out.println("Ingresando al segundo finally");
        }
    }
}
