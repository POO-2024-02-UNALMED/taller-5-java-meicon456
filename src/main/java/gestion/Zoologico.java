package gestion;

import zooAnimales.Animal;
import java.util.List;

public class Zoologico {
    private List<Zona> zonas;

    public Zoologico(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void mostrarAnimales() {
        for (Zona zona : zonas) {
            for (Animal animal : zona.getAnimales()) {
                System.out.println(animal);
            }
        }
    }
}
