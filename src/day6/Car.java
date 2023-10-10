package day6;

public class Car {
    private String model;
    private String color;
    private int age;

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - getAge());
    }

}
