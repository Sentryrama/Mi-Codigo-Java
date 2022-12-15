package Week1;

import java.util.Scanner;

public class Clase03 {
    static Scanner sc = new Scanner(System.in);
    
    public static void fun(){
        System.out.print("Ingresa tu nombre completo: ");
        String name = sc.nextLine();
        System.out.println("Hola " + name);
        String nameReverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            nameReverse += name.charAt(i);
        }
        System.out.println("Tu nombre al revés es: " + nameReverse);
    }
}
