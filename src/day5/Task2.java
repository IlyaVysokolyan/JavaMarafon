package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Suzuki SX1", "Red", 2023);

        System.out.println("Модель: " + motorbike.getModel() +
                "\nЦвет: " + motorbike.getColor() +
                "\nГод производства: " + motorbike.getAge());
    }
}
