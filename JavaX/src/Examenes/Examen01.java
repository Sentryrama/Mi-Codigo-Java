package Examenes;
import java.util.*;
public class Examen01 {
    static Scanner sc = new Scanner(System.in);
    static Integer opcion = 0;
    static Integer suma;
    static Integer cantidad;
    static Integer total;
    public static void fun(){
        do{
            opcion=menu();
            switch(opcion){
                case 1 -> promedio();
                case 2 -> mayorMenor();
                case 3 -> sumatoria();
                case 4 -> factorial();
                case 5 -> potencia();
                case 6 -> raiz();
                case 7 -> System.exit(0);
                default -> error();
            }
        }while(opcion != 7);
    }

    private static int menu(){
        System.out.print("\n---CALCULADORA---"+
        "\nSelecciona una opción\n"+
        "1-Promedio\n"+
        "2-Mayor ó Menor\n"+
        "3-Sumatoria\n"+
        "4-Factorial\n"+
        "5-Potencia\n"+
        "6-Raíz\n"+
        "7-Salir\n"+
        "-----: ");
        opcion = sc.nextInt();   
        return opcion;
    }
    private static void promedio(){
        System.out.print("Cuántos números quieres promediar?: ");
        cantidad = sc.nextInt();
        suma = 0;
        int[] arreglo = new int[cantidad];
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("["+(i+1)+"]: ");
            arreglo[i] = sc.nextInt();
            suma += arreglo[i];
        }
        System.out.println("El promedio es: "+(suma/cantidad));
    }
    private static void mayorMenor(){
        System.out.print("Cuántos números quieres ingresar?: ");
        cantidad =  sc.nextInt();
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < cantidad; i++){
            int numero = sc.nextInt();
            if(numero >= mayor){mayor = numero;}
            if(numero <= menor){menor = numero;}
        }
        System.out.println("El número MAYOR es: "+mayor);
        System.out.println("El número MENOR es: "+menor);
    }
    private static void sumatoria(){
        System.out.print("Ingresa el número para obtener la sumatoria: ");
        int numero = sc.nextInt();
        total = 0;
        for(int i = numero; i > 0; i--){
            total += numero;
        }
        System.out.println("La sumatora de "+numero+" es: "+total);
    }
    private static void factorial(){
        System.out.print("Ingresa el número para obtener el factorial: ");
        int numero = sc.nextInt();
        total = 1;
        for(int i = 1; i <= numero; i++){
            total *= i;
        }
        System.out.println("El factorial de "+numero+" es: "+total);
    }
    private static void potencia(){
        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa el exponente: ");
        double exponente = sc.nextDouble();
        System.out.println("La potencia "+exponente+" de "+base+" es: "+Math.pow(base,exponente));
    }
    private static void raiz(){
        System.out.print("Ingresa el radicando: ");
        double radicando = sc.nextDouble();
        System.out.print("Ingresa el indice: ");
        double indice = sc.nextDouble();
        System.out.println("La raiz "+indice+" de "+radicando+" es: "+Math.pow(radicando,1/indice));
    }
    private static void error(){
        System.out.println("Opción no valida, selecciones nuevamente");
    }
}
