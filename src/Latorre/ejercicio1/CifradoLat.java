package Latorre.ejercicio1;

public class CifradoLat {

    // Abecedario utilizado para el cifrado
    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

    //Metodo para codificar un string dada la clave de desplazamiento.
    public static String codificar(String mensaje, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            int indice = ABECEDARIO.indexOf(caracter);
            if (indice != -1) {
                int indiceCifrado = (indice + desplazamiento) % ABECEDARIO.length();
                resultado.append(ABECEDARIO.charAt(indiceCifrado));
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }

    //Metodo para decodificarlo

    public static String decodificar(String mensajeCifrado, int desplazamiento){
        return codificar(mensajeCifrado, ABECEDARIO.length()-desplazamiento);
    }
}
