package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
    private static int halcones;
    private static int aguilas;
    private static List<Ave> aves = new ArrayList<>();
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        aves.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aves.add(aguila);
        return aguila;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void mostrarAves() {
        System.out.println("Listado de Aves:");
        for (Ave ave : aves) {
            System.out.println("Nombre: " + ave.nombre + ", Edad: " + ave.edad + " años, Genero: " + ave.genero);
        }
    }
}
