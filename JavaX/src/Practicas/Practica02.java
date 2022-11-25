package Practicas;

import java.util.*;

public class Practica02{
    static Scanner sc = new Scanner(System.in);
    static Integer opcion;
    static Double[] valor = new Double[2];
    static Double res;
    public static void fun(){
        do{
            menu();
            switch(opcion){
                case 1 -> operacion("suma");
                case 2 -> operacion("resta");
                case 3 -> operacion("multiplicacion");
                case 4 -> operacion("division");
                case 5 -> operacion("potencia");
                case 6 -> operacion("raiz");
            }
            System.out.println("Valor 1:["+valor[0]+"] Valor 2:["+valor[1]+"]");
        }while(opcion != 7);
    }
    private static void menu(){
        System.out.print("\nSelecciona una opción\n"+
        "1-Suma\n"+
        "2-Resta\n"+
        "3-Multiplicación\n"+
        "4-División\n"+
        "5-Potencia\n"+
        "6-Raíz\n"+
        "7-Salir\n"+
        "------: ");
         opcion = sc.nextInt();
    }
    private static void peticion(Integer x){
        System.out.print("Ingrese el valor "+(x+1)+": ");
        valor[x] = sc.nextDouble(); 
    }
    private static void operacion(String tipo){
        peticion(0);
        peticion(1);
        System.out.print("El resultado es: ");
        switch (tipo){
            case "suma"             -> System.out.println(valor[0] + valor[1]);
            case "resta"            -> System.out.println(valor[0] - valor[1]);
            case "multiplicacion"   -> System.out.println(valor[0] * valor[1]);
            case "division"         -> System.out.println(valor[0] / valor[1]);
            case "potencia"         -> System.out.println(Math.pow(valor[0], valor[1]));
            case "raiz"             -> System.out.println(Math.pow(valor[0], 1/valor[1])); 
        }
    }    
}