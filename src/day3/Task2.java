package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введи делимое: ");
            double x = scanner.nextDouble();
            System.out.print("Введи делитель: ");
            double y = scanner.nextDouble();
            if (y == 0) {
                System.out.println("На ноль делить нельзя!:) ");
                break;
            }
            double z = x / y;
            System.out.println("Равно: " + z);


        }
    }
}
