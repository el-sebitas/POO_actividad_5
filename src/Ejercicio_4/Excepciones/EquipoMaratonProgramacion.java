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
}
