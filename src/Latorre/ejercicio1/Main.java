package Latorre.ejercicio1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static Latorre.ejercicio1.BuscLetraString.ordenarNumeros;

public class Main {
    public static void main(String[] args) {


        // Ejemplo de uso del método contarLetra
        String palabra = "Hola mundo";
        char letra = 'o';
        int cantidad = BuscLetraString.contarLetra(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la palabra '" + palabra + "'");


        // Ejemplo de uso del método sumarNumerosMayoresQueX
        int[] numeros = {1, 2, 3, 4, 5};
        int x = 2;
        int suma = BuscLetraString.sumarNumerosMayoresQueX(numeros, x);
        System.out.println("La suma de los números mayores que " + x + " es " + suma);

        //Ejemplo cifrador y descifrador

        String mensaje = "hola que tal querido";
        int desplazamiento = 2;

        String mensajeCifrado = CifradoLat.codificar(mensaje, desplazamiento);
        String mensajeDescifrado = CifradoLat.decodificar(mensajeCifrado, desplazamiento);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);


        //automaticacion del pasaje de parametros
        int a, b, c;
        boolean ascendente;
        char orden = 'n';

        if (args.length == 4) {
            // Si hay 4 argumentos, asumimos que son a, b, c y ascendente
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            ascendente = args[3].equalsIgnoreCase("ascendente");
        } else {
            // Si no hay 4 argumentos, solicitamos los valores por consola
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el valor de a: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el valor de b: ");
            b = scanner.nextInt();
            System.out.print("Ingrese el valor de c: ");
            c = scanner.nextInt();
            System.out.println("Ingrese 'a' para ordenar de forma ascendente o 'd' para ordenar de forma descendente:");
            while (true) {
                orden = scanner.next().charAt(0);
                if (orden == 'a' || orden == 'd') {

                    break;
                }
                System.out.println("Por favor, ingrese 'a' o 'd'.");
            }
        }
        ascendente = (orden == 'a');

        int[] numerosOrdenados = BuscLetraString.ordenarNumeros(a, b, c, ascendente);
        System.out.println("Los números ordenados son: " + Arrays.toString(numerosOrdenados));


        //

        String rutaArchivo = "D:/Adrian/programacion fullstack/curso java/ejClase3Latorre/numeros.txt";
        int sumas=SumaNumerosArchivo.sumarNumeros(rutaArchivo);

        System.out.println("La suma de los numeros del archivo es: "+sumas);


    }



}
