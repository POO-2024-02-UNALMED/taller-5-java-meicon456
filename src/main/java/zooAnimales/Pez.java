package zooAnimales;

public class Pez extends Animal {
    private static int cantidadPeces;

    public Pez() {
        cantidadPeces++;
    }

    public Pez(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadPeces++;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static int cantidadPeces() {
        return cantidadPeces;
    }

    public static void setCantidadPeces(int cantidadPeces) {
        Pez.cantidadPeces = cantidadPeces;
    }
}
