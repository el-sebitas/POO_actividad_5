package Ejercicio_1.Excepciones.UI;

public class Operacion {
    public static double operacion (String numerador, String denominador) {
        double resultado;
        try {
            System.out.println(denominador);
            resultado = Integer.valueOf(numerador)/Integer.valueOf(denominador);
        } catch (ArithmeticException e) {
            resultado = 0;
            System.out.println("hola");
        } catch (Exception e) {
            resultado = -1;
        }
        return resultado;
    }
}
