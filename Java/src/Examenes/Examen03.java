package Examenes;
import java.util.*;
public class Examen03{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Automovil> lista = new ArrayList<Automovil>();    
    static Integer opcion = 0;
    public static void fun(){
        lista.add(new Automovil("Chevrolet", "Malubu", 2010, 90_000.0, "123UAV"));
        lista.add(new Automovil("Honda","Civic",2015,100_000.00, "456AUR"));
        lista.add(new Automovil("Nissan", "Altima", 2018, 130_000.00, "789ZXC"));
        do{
            menu();
            switch(opcion){
                case 1 -> agregarVehiculo();
                case 2 -> retirarVehiculo();
                case 3 -> mostarStock();
                case 4 -> System.exit(0);
                default -> System.out.println("Opcion no valida.");
            }
        }while(opcion != 4);
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
        System.out.print("Ingrese la placa: ");
        String placa = sc.next();
        lista.add(new Automovil(marca, modelo, año, precio, placa));
    }
    private static void retirarVehiculo(){
        System.out.print("Ingrese la placa que desea retirar: ");
        String placa = sc.next();
        for(int i = 0; i < lista.size(); i++){
            if(placa.equals(lista.get(i).getPlaca())){
                lista.remove(i);
            }
        }
        mostarStock();
    }
    private static void mostarStock(){
        for(Automovil i : lista){
            System.out.println(i);
        }
    }
    public static void menu(){
        System.out.println("Que deseas realizar?: ");
        System.out.print("1- Agregar un vehiculo\n2- Retirar un vehiculo\n"+
        "3- Ver el stock de vehiculos\n------:");
        opcion = sc.nextInt();
    }
}
class Automovil{
    private String marca;
    private String modelo;
    private Integer año;
    private Double precio;
    private String placa;

    Automovil(String marca, String modelo, Integer año, Double precio, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año; 
        this.precio = precio;
        this.placa = placa;
    }
    public String toString(){
        return "#####Automovil#####"+
        "\nMarca : "+marca+
        "\nModelo: "+modelo+
        "\nAño   : "+año+
        "\nPrecio: $"+precio+
        "\nPlaca : "+placa+"\n";
    }
    public String getPlaca(){
        return placa;
    }
}