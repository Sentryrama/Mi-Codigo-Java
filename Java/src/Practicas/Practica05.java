package Practicas;

import java.util.*;

public class Practica05{
    static Random rn = new Random();
    static Scanner sc = new Scanner(System.in);
    static Integer filas;
    static Integer columnas;
    public static void fun(){
        filas = tamaño("Filas");
        columnas = tamaño("Columnas");
        int[][] arreglo = new int[filas][columnas];
        int[] vector = new int[filas*columnas];
            System.out.println("El arreglo generado originalmente:");
        rellenar(arreglo);
        imprimir(arreglo);

            System.out.println("El arreglo ordenado por filas:");

        ordenarPorFilas(arreglo);
    
            System.out.println("El arreglo ordenado por completo:");

        ordenarPorCompleto(vector, arreglo);
        volverBidimensional(vector, arreglo);
    }
    private static Integer tamaño(String x){
        System.out.print("Ingresa el tamaño de las "+x+": ");
        return sc.nextInt();
    } 
    private static void rellenar(int[][] arreglo){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                arreglo[i][j] = rn.nextInt(10);
            }
        }   
    }
    private static void imprimir(int[][] arreglo){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print("["+arreglo[i][j]+"]");
            }
            System.out.println();
        }        
    }
    private static void imprimir(int[] vector){
        for(int i: vector){
            System.out.print("["+i+"]");
        }
    }
    private static void ordenarPorFilas(int[][] arreglo){
        int fila = 0;
        int[] miniVector = new int[arreglo[fila].length];
        do{
            for(int i = 0; i < miniVector.length; i++){
                miniVector[i] = arreglo[fila][i];
            }
            fila++;
            Arrays.sort(miniVector);
            imprimir(miniVector);
            System.out.println();
            
        }while(fila < arreglo.length);
    }
    private static void ordenarPorCompleto(int[] vector,int[][] arreglo){
        Integer k = 0;
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[0].length; j++){
                vector[k] = arreglo[i][j];
                k++;
            }
        }
        Arrays.sort(vector);
    }
    private static void volverBidimensional(int[] vector, int[][] arreglo){
        Integer k = 0; 
        for(int i = 0; i < filas ; i++){
            for(int j = 0; j < columnas; j++){
                arreglo[i][j] = vector[k];
                k++;
            }
        }
        imprimir(arreglo);
    }

}