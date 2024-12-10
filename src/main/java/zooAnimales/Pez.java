package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;
    public static int salmones = 0;
    public static int bacalaos = 0;
    private static List<Pez> listado = new ArrayList<>();

    public Pez() {
        super();
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    @Override
    public String movimiento() {
        return "nadar";
    }


    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        listado.add(bacalao);
        return bacalao;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public static List<Pez> getListado() {
        return listado;
    }

    public static void setListado(List<Pez> listado) {
        Pez.listado = listado;
    }


    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}

