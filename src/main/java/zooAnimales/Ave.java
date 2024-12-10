package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
    private String colorPlumas;
    public static int aguilas = 0;
    public static int halcones = 0;
    private static List<Ave> listado = new ArrayList<>();

    public Ave() {
        super();
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }
    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(aguila);
        return aguila;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        Ave halcon = new Ave(nombre, edad, "ciudad", genero, "gris");
        listado.add(halcon);
        return halcon;
    }

    public static int cantidadAves() {
        return listado.size();
    }

    public static List<Ave> getListado() {
        return listado;
    }

    public static void setListado(List<Ave> listado) {
        Ave.listado = listado;
    }

    // Getters y setters
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
