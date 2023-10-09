package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Tesla X");
        car.setColor("Black");
        car.setAge(2013);

        System.out.println("Модель: " + car.getModel() +
                "\nЦвет: " + car.getColor() +
                "\nГод производства: " + car.getAge());

    }
}
