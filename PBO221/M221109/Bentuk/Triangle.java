package PBO221.M221109.Bentuk;

public class Triangle extends Shape {
    float base, height;

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // public Triangle() {
    // }

    @Override
    public void getArea() {
        // TODO Auto-generated method stub
        System.out.println("Warna segitiga: " + color);
        System.out.println("Luas Segitiga: " + getBase() * getHeight() / 2);
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

}
