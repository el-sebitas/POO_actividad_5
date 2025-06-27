package Ejercicio_5.Excepciones;

import java.io.*;

public class LeerArchivo {
    public static String verDoc() {
        FileInputStream archivo;
        InputStreamReader entrada;
        BufferedReader teclado;
        String texto = "";
        try {
            String file = "C:\\Users\\SEBAS\\IdeaProjects\\POO_actividad_5\\src\\Ejercicio_5\\Excepciones\\file.txt";
            archivo = new FileInputStream(file);
            entrada = new InputStreamReader(archivo);
            teclado = new BufferedReader(entrada);
            String linea = teclado.readLine();
            while (linea != null) {
                System.out.println(linea);
                texto += linea + "\n";
                linea = teclado.readLine();
            }
            teclado.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return texto;
    }
}
