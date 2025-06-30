package Ejercicio_3.Excepciones;

import javax.swing.*;

public class CalculosNumericos {
    public static double logE(double valor) {
        double resultado;
        try {
            if (valor < 0) {
                throw new ArithmeticException("valor negativo");
            } else if (valor == 0) {
                throw new ArithmeticException("valor 0");
            }
            System.out.println(Math.log(valor));
            resultado = Math.log(valor);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            resultado = 0;
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return resultado;
    }

    public static double raiz(double valor) {
        double resultado;
        try {
            if (valor < 0) {
                throw new ArithmeticException("valor negativo");
            }
            System.out.println(Math.sqrt(valor));
            resultado = Math.sqrt(valor);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            resultado = 0;
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return resultado;
    }
}
