package PBO221.M221109.Bentuk;

public class Circle extends Shape {
    float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    // public Circle() {
    // }

    @Override
    public void getArea() {
        // TODO Auto-generated method stub
        System.out.println("Warna lingkaran: " + color);
        System.out.println("Luas lingkaran: " + Math.PI * Math.pow(getRadius(), 2) / 4);
    }

    public float getRadius() {
        return radius;
    }

}
