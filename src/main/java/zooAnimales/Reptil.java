package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;
    public static int iguanas = 0;
    public static int serpientes = 0;
    private static List<Reptil> listado = new ArrayList<>();

    public Reptil() {
        super();
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        listado.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "marron", 2);
        listado.add(serpiente);
        return serpiente;
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    public static List<Reptil> getListado() {
        return listado;
    }

    public static void setListado(List<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}

  
