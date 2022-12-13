package Week1.Excepciones;

import java.util.*;

public class Excepciones01 {
    static Scanner sc = new Scanner(System.in);
    static int valor1, valor2, resultado;
    public static void main(String[] args) {
        try{
            System.out.print("Ingresa el primer valor: ");
            valor1 = sc.nextInt();
            System.out.print("Ingresa el segundo valor: ");
            valor2 = sc.nextInt();
            resultado = valor1 / valor2;
            System.out.println("El resultado de sumar "+ valor1 +" y "+ valor2+" es: "+resultado);
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la operación");
            System.out.println(e);
        }
        finally{
            System.out.println("Fin del programa");
        }
    }
}
