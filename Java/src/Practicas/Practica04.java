package Practicas;

import java.util.*;

public class Practica04 {
    static Scanner sc = new Scanner(System.in);
    //static String figura;
    static Integer opcion;
    static Double radio;
    static Double base;
    static Double altura;
    static Double area;
    static Double perimetro;

    public static void fun() {
        menu();
        opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> figura("triangulo");
            case 2 -> figura("cuadrado");
            case 3 -> figura("rectangulo");
            case 4 -> figura("circulo");
        }
    }

    private static void menu() {
        System.out.print("Seleciona una figura:\n1-Triángulo\n" +
                "2-Cuadrado\n3-Rectángulo\n4-Círculo\n-------:");
    }
    private static void figura(String figura) {
        switch (figura) {
            case "triangulo"    -> {medidas("a");       operaciones(1);}
            case "cuadrado"     -> {medidas("cuadrado");operaciones(2);}
            case "rectangulo"   -> {medidas("c");       operaciones(3);}
            case "circulo"      -> {medidas("circulo"); operaciones(4);}
        }
        System.out.print("Qué quieres conocer?: 1=Área  2=Perimetro 3=Ambos\n-------: ");
        opcion = sc.nextInt();
        switch(opcion){
            case 1 -> System.out.println("Área: "+area);
            case 2 -> System.out.println("Perimetro: "+perimetro);
            case 3 -> {System.out.println("Área: "+area); 
            System.out.println("Perimetro: "+perimetro);}
            default -> System.out.println("No Existe la opción, inicia de nuevo");
        }
    }
    private static void medidas(String figura) {
        if(figura == "circulo"){
            uno("el radio: ");
        }else if(figura == "circulo"){
            uno("un lado: ");
        }else{
            dos();
        }
    }
    private static void uno(String x){
        System.out.print("Ingresa "+x);
        radio = sc.nextDouble();
    }
    private static void dos(){
        System.out.print("Ingresa la base: ");
        base = sc.nextDouble();
        System.out.print("Ingresa la altura: ");
        altura = sc.nextDouble();
    }
    private static void operaciones(int x){
        if(x==1){
            area = (base * altura) / 2;
            perimetro = base + ((Math.sqrt(Math.pow(altura,2)) + Math.sqrt(Math.pow(base/2,2))) * 2);
        }else if(x==2){
            area = (base * base);
            perimetro = (base * 4);
        }else if(x==3){
            area = base * altura;
            perimetro = (base * 2) + (altura * 2);
        }else if(x==4){
            area = (radio * radio) * Math.PI;
            perimetro = (radio * 2) * Math.PI;
        }
    }
}