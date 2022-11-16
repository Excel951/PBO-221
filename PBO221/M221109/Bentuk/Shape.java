package PBO221.M221109.Bentuk;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract public void getArea();
}
