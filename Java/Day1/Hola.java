package Day1;

import java.util.Scanner;
public class Hola{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.printf("Mucho gusto en conocerte %s \n", nombre);
    }
}
