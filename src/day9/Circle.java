package day9;

public class Circle extends Figure {

    private double circleRadius;

    public Circle(double circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return circleRadius * circleRadius;
    }

    @Override
    public double perimeter() {
        return circleRadius * 4;
    }
}
