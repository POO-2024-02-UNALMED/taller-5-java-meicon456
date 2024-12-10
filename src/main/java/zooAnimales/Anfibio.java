package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;
    public static int ranas = 0;
    public static int salamandras = 0;
    private static List<Anfibio> listado = new ArrayList<>();

    public Anfibio() {
        super();
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }
    
    @Override
    public String movimiento() {
        return "saltar";
    }


    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "verde", true);
        listado.add(rana);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        Anfibio salamandra = new Anfibio(nombre, edad, "bosque", genero, "negro y amarillo", false);
        listado.add(salamandra);
        return salamandra;
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public static List<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(List<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}


