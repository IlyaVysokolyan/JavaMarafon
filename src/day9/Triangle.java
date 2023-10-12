package day9;

public class Triangle extends Figure {

    private double sideLengthA;
    private double sideLengthB;
    private double sideLengthC;

    public Triangle(double sideLengthA, double sideLengthB, double sideLengthC,String color) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideLengthA) * (p - sideLengthB) * (p - sideLengthC));
    }

    @Override
    public double perimeter() {
        return sideLengthA + sideLengthB + sideLengthC;
    }
}
