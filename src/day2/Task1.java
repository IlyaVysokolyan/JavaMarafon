package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите число этажей: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a <= 4 && a >= 1) System.out.println("Малоэтажный дом");
        if (a <= 8 && a >= 5) System.out.println("Среднеэтажный дом");
        if (a >= 9) System.out.println("Многоэтажный дом");
        if (a <= 0) System.out.println("Ошибка ввода");

    }
}
