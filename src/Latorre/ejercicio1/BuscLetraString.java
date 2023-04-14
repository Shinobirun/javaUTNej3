package Latorre.ejercicio1;

import java.util.Arrays;

public class BuscLetraString {

    public static int contarLetra(String palabra, char letra){
        int contador = 0;
        for (int i=0; i <palabra.length(); i++){
            if (palabra.charAt(i)== letra) {
                contador++;


            }
        }
        return contador;
    }

    public static int[] ordenarNumeros(int a, int b , int c, boolean ascendente){
        int[] numeros = {a,b,c};
        if (ascendente) {
            Arrays.sort(numeros);
        }else {
            Arrays.sort(numeros);
            int temp = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = temp;
        }
        return numeros;

    }

    public static int sumarNumerosMayoresQueX(int[] numeros, int x){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]>x){
                suma += numeros[i];
            }
        }
        return suma;    }

    
}
