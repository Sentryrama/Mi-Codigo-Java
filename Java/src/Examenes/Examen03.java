package Examenes;
import java.util.*;
public class Examen03{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Automovil> lista = new ArrayList<Automovil>();    
    public static void fun(){
        lista.add(new Automovil("Chevrolet", "Malubu", 2010, 90_000.0));
        lista.add(new Automovil("Honda","Civic",2015,100_000.00));
       // System.out.println(lista.get(0));
        for(Automovil i : lista){
            System.out.println(i);
        }       
    }
    private static void agregarVehiculo(){
        System.out.print("Ingresa la marca: ");
        String marca = sc.next();
        System.out.print("Ingresa el modelo: ");
        String modelo = sc.next();
        System.out.print("Ingresa el año de fabricacion: ");
        Integer año = sc.nextInt();
        System.out.print("Ingresa el precio: ");
        Double precio = sc.nextDouble();
        lista.add(new Automovil(marca, modelo, año, precio));
    }
}
class Automovil{
    private String marca;
    private String modelo;
    private Integer año;
    private Double precio;

    Automovil(String marca, String modelo, Integer año, Double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año; 
        this.precio = precio;
    }
    public String toString(){
        return "\n#####Automovil#####\nMarca: "+marca+
        "\nModelo: "+modelo+
        "\nAño: "+año+
        "\nPrecio: $"+precio;
    }
}