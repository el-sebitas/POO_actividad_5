package Ejercicio_2.Excepciones;

import java.util.Scanner;

public class Vendedor {
    private String nombre;
    private String apellidos;
    private int edad;

    public Vendedor(String apellidos, int edad, String nombre) {
        this.apellidos = apellidos;
        verificarEdad(edad);
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    private void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
        } else if (edad < 0 || 120 < edad) {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        } else {
            this.edad = edad;
            throw new IllegalArgumentException("Vendedor creado");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        Vendedor vendedor = new Vendedor(apellido, edad, nombre);
        vendedor.imprimir();
    }
}
