package zooAnimales;

public class Reptil extends Animal {
    private static int cantidadReptiles;

    public Reptil() {
        cantidadReptiles++;
    }

    public Reptil(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadReptiles++;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles() {
        return cantidadReptiles;
    }

    public static void setCantidadReptiles(int cantidadReptiles) {
        Reptil.cantidadReptiles = cantidadReptiles;
    }
}
