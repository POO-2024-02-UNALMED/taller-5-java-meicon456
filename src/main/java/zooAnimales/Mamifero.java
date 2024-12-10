package zooAnimales;

public class Mamifero extends Animal {
    private static int cantidadMamiferos;

    public Mamifero() {
        cantidadMamiferos++;
    }

    public Mamifero(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadMamiferos++;
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }

    public static int cantidadMamiferos() {
        return cantidadMamiferos;
    }

    public static void setCantidadMamiferos(int cantidadMamiferos) {
        Mamifero.cantidadMamiferos = cantidadMamiferos;
    }
}
