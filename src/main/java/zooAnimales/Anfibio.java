package zooAnimales;

public class Anfibio extends Animal {
    private static int cantidadAnfibios;

    public Anfibio() {
        cantidadAnfibios++;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadAnfibios++;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static int cantidadAnfibios() {
        return cantidadAnfibios;
    }

    public static void setCantidadAnfibios(int cantidadAnfibios) {
        Anfibio.cantidadAnfibios = cantidadAnfibios;
    }
}
