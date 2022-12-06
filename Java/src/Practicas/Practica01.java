package Practicas;

import java.util.*;

public class Practica01 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> calificaciones = new ArrayList<Double>();
    static Double mayor = 0.0;
    static Double menor = 10.0;
    static Double promedio2 = 0.0;
    static Double promedio5 = 0.0;
    static String equivalente = "";
    static Integer cantidad;

    public static void fun(){
        System.out.print("Cuantas calificaciones quieres ingresar?: ");
        cantidad = sc.nextInt();
        for ( int i = 1 ; i <= cantidad ; i++){
            calificacion(i);
        }
        mayor_y_menor();
        promedios();
        equivalencia();
        System.out.println("La calificación mayor es: "+ mayor);
        System.out.println("La calificación menor es: "+ menor);
        System.out.println("El promedio es estas 2 es: "+ promedio2+
        " y es equivalente a "+ equivalente);
        System.out.println("El promedio de las "+cantidad+" calificaciones es : "+ promedio5);
    }

    private static void calificacion(Integer numero){
        System.out.print("Nota " + numero+": ");
        calificaciones.add(sc.nextDouble());
    }

    private static void mayor_y_menor(){
        for( int i = 0 ; i < calificaciones.size() ; i++){
            if ( calificaciones.get(i) < menor ){
                menor = calificaciones.get(i);
            }
            if ( calificaciones.get(i) > mayor ){
                mayor = calificaciones.get(i);
            }
        }
    }

    private static void promedios(){
        Double suma = 0.0;
        for ( int i = 0 ; i < calificaciones.size() ; i++){
            suma += calificaciones.get(i);
        }
        promedio5 = suma/5;
        promedio2 = (mayor + menor)/2;
    }

    private static void equivalencia(){
        if ( promedio2 >  0.0 && promedio2 <  6.0){
            equivalente = "NA";
        }
        if ( promedio2 >= 6.0 && promedio2 <  7.5){
            equivalente = "S";
        }
        if ( promedio2 >= 7.5 && promedio2 <  9.0){
            equivalente = "B";
        }
        if ( promedio2 >= 9.0 && promedio2 <=10.0){
            equivalente = "MB";
        }
    }
    

}
