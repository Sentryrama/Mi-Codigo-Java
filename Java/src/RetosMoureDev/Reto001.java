package RetosMoureDev;

import java.util.*;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto001 {
    static Scanner sc = new Scanner(System.in);
    public static void fun(){
        System.out.println("ANAGRAMAS");
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();
        System.out.println("¿Son anagramas?: " + (esAnagrama(palabra1, palabra2)? "Sí" : "No"));

    }
    private static boolean esAnagrama(String palabra1, String palabra2){
        if(palabra1.length() != palabra2.length())
            return false;
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        char[] palabra1Array = palabra1.toCharArray();
        char[] palabra2Array = palabra2.toCharArray();
        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);
        return Arrays.equals(palabra1Array, palabra2Array);
    }
}
