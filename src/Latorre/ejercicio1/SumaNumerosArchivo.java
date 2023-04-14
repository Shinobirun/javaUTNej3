package Latorre.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaNumerosArchivo {

    public static int sumarNumeros(String rutaArchivo) {
        try {
            Scanner scanner = new Scanner(new File(rutaArchivo));
            int suma = 0;
            while (scanner.hasNextInt()) {
                suma += scanner.nextInt();
            }
            return suma;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra en la ruta proporcionada: " + rutaArchivo);
            return 0;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar la ruta del archivo como parámetro");
            return;
        }

        String rutaArchivo = args[0];
        int suma = sumarNumeros(rutaArchivo);
        System.out.println("La suma de los números del archivo es: " + suma);
    }
}