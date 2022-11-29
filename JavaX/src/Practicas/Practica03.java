package Practicas;

import java.util.*;

public class Practica03{
    static ArrayList<Double> lista = new ArrayList<Double>();
    static Scanner sc = new Scanner(System.in);
    public static void fun(){
        int opcion = 1;
        do{
            peticion();
            opcion = pregunta();

        }while( opcion != 0 || opcion != 0);
        Collections.sort(lista);
        System.out.println(lista);
        media();
        mediana();
        sc.close();

        System.out.println(lista.size());
        System.out.println(lista.get(lista.size()/2));
        System.out.println(lista.get(lista.size()/2-1));
    }
    public static void peticion(){
        System.out.print("\nIngresa el dato: ");
        Double y = sc.nextDouble();
        lista.add(y);
    }
    private static int pregunta(){    
        System.out.print("Quieres ingresar otro dato? Si => 1 / No => 0: ");
        int x = sc.nextInt();
        return x;
    }
    private static void media(){
        Double suma = 0.0; 
        for ( int i = 0; i<lista.size(); i++ ){
            suma += lista.get(i);
        }
        System.out.print("La media es: ");
        System.out.println(suma/lista.size());
    }
    private static void mediana(){
        System.out.print("La mediana es: ");
        if (lista.size()%2 == 0){
            System.out.println((lista.get(lista.size()/2) + lista.get(lista.size()/2-1))/2);
        }else{
            System.out.println(lista.get(lista.size()/2));
        }
    }
}