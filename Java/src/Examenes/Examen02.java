package Examenes;
import java.util.*;
public class Examen02 {
    static Scanner sc = new Scanner(System.in);
    static Random  rn = new Random();
    static Integer filas;
    static Integer columnas;
    public static void fun(){
        menu();
        int[][] arreglo1 = new int[filas][columnas];
        int[][] arreglo2 = new int[filas][columnas];
        llenarArreglo(arreglo1);
        llenarArreglo(arreglo2);
        imprimir(arreglo1);
        imprimir(arreglo2);
        compararArreglos(arreglo1, arreglo2);
    }
    private static void menu(){
        System.out.print("Cúantas filas quieres?: ");
        filas = sc.nextInt();
        System.out.print("Cuántas columnas quieres?: ");
        columnas = sc.nextInt();
    }
    private static void llenarArreglo(int[][] arreglo){
        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++) {
                arreglo[i][j] = rn .nextInt(10);
            }
        }
    }
    private static void compararArreglos(int[][] arreglo1, int[][] arreglo2){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(arreglo1[i][j] != arreglo2[i][j]){
                    System.out.println("Los arreglo NO tienen el mismo contenido");
                    System.exit(0);
                }
            }
        }
        System.out.println("Los arreglos SI tienen el mismo contenido");
    } 
    private static void imprimir(int[][] arreglo){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print("["+arreglo[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println();        
    }
}