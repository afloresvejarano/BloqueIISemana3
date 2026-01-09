package Ejercicio2;

public abstract class Figura implements Dibujable {
    private String color;
    private String nombre;

    public Figura(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }
}
