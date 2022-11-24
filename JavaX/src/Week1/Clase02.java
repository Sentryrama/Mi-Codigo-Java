package Week1;

import java.util.Scanner;

public class Clase02 {
    static Scanner sc = new Scanner(System.in);
    public static void fun01(){
        System.out.print("Ingresa un numero: ");
        Double numero = sc.nextDouble();
        if ( numero == 0 ){
            System.out.println("El número es cero.");
        }else
        if ( numero < 0 ){
            System.out.println("El número es menor a cero.");
        }else
        if ( numero > 0 ){
            System.out.println("El número es mayor a cero.");
        }
    }
}
