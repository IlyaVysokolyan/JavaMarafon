package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Tesla X", "Black",2013);
        car.info();
        System.out.println(car.yearDifference(2000));

    }
}
