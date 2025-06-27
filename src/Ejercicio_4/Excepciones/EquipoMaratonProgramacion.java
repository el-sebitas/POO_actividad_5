package Ejercicio_4.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipoMaratonProgramacion {
    public String nombreEquipo;
    public String universidad;
    public String lengProgramacion;
    public int numEquipo;
    public ArrayList<Programador> programadores;

    public EquipoMaratonProgramacion(String lengProgramacion, String nombreEquipo, String universidad) {
        this.lengProgramacion = lengProgramacion;
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.numEquipo = 0;
        this.programadores = new ArrayList<>(3);
    }

    public static void validar(String nombre) throws Exception {
        if (nombre.length() >= 20) {
            throw new Exception("Numero de caracteres excedido");
        }

        for (char a: (nombre).toCharArray()) {
            if (Character.isDigit(a)) {
                throw new Exception("Caracteres invalidos");
            }
        }
    }

    public boolean completo() {
        return numEquipo == 3;
    }

    public void añadirProgramador(Programador p) throws Exception{
        if (completo()) {
            throw new Exception("Equipo lleno");
        }
        programadores.add(p);
        numEquipo++;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Lenguaje de programacion: ");
        String lenProgramacion = sc.nextLine();
        System.out.print("Universidad: ");
        String universidad = sc.nextLine();

        EquipoMaratonProgramacion equipo = new EquipoMaratonProgramacion(lenProgramacion, nombre, universidad);
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del programador: ");
            String nombreP = sc.nextLine();
            EquipoMaratonProgramacion.validar(nombreP);
            System.out.print("Apellido del programador: ");
            String apellido = sc.nextLine();
            EquipoMaratonProgramacion.validar(apellido);

            Programador p = new Programador(apellido, nombreP);
            equipo.añadirProgramador(p);
        }

        System.out.println(equipo.nombreEquipo);
        System.out.println(equipo.universidad);
        System.out.println(equipo.lengProgramacion);
        System.out.println(equipo.programadores.size());
    }
}
