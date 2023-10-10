package day6;

public class Motorbike {
    private String model;
    private String color;
    private int age;

    public Motorbike(String model, String color, int age) {
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

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear-getAge());
    }
}
