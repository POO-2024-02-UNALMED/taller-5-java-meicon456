package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
    private static int iguanas;
    private static int serpientes;
    private static List<Reptil> reptiles = new ArrayList<>();
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        Reptil iguana = new Reptil(nombre, edad, "selva", genero, "verde", 3);
        reptiles.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "marron", 1);
        reptiles.add(serpiente);
        return serpiente;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void mostrarReptiles() {
        System.out.println("Listado de Reptiles:");
        for (Reptil reptil : reptiles) {
            System.out.println("Nombre: " + reptil.nombre + ", Edad: " + reptil.edad + " años, Genero: " + reptil.genero);
        }
    }
}
