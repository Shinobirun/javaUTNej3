package Latorre.ejercicio1;


public class Main {
    public static void main(String[] args) {


        // Ejemplo de uso del método contarLetra
        String palabra = "Hola mundo";
        char letra = 'o';
        int cantidad = BuscLetraString.contarLetra(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la palabra '" + palabra + "'");

        // Ejemplo de uso del método ordenarNumeros
        int a = 10;
        int b = 5;
        int c = 20;
        boolean ascendente = false;
        int[] numerosOrdenados = BuscLetraString.ordenarNumeros(a, b, c, ascendente);
        System.out.println("Los números ordenados de manera " + (ascendente ? "ascendente" : "descendente") + " son: ");
        for (int numero : numerosOrdenados) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Ejemplo de uso del método sumarNumerosMayoresQueX
        int[] numeros = { 1, 2, 3, 4, 5 };
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
    }



}
