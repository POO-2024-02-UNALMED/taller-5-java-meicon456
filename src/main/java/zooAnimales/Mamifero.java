package zooAnimales;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    @Override
    public String movimiento() {
        return "caminar";
    }

    // Getters y setters...
}
