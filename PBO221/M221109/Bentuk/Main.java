package PBO221.M221109.Bentuk;

public class Main {
    public static void main(String[] args) {
        Shape segitiga1 = new Triangle(null, 0, 0);

        Shape lingkaran1 = new Circle(null, 0);

        segitiga1.color = "Biru";
        lingkaran1.color = "Merah";

        segitiga1 = new Triangle(segitiga1.color, 10, 15);
        lingkaran1 = new Circle(lingkaran1.color, 14);

        segitiga1.getArea();
        lingkaran1.getArea();
    }
}
