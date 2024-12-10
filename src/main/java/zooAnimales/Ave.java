package zooAnimales;

public class Ave extends Animal {
    private static int cantidadAves;

    public Ave() {
        cantidadAves++;
    }

    public Ave(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadAves++;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static int cantidadAves() {
        return cantidadAves;
    }

    public static void setCantidadAves(int cantidadAves) {
        Ave.cantidadAves = cantidadAves;
    }
}
