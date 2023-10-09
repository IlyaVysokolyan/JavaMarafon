package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива:");
        int sizeMas = scanner.nextInt();
        int[] massiv = new int[sizeMas];

        int amNumEight = 0; // больше 8
        int amNumEqOne = 0; // равны 1
        int amEvenNum = 0; // четные
        int oddEvenNum = 0; // нечетные
        int sumMass = 0; // сумма массива

        //Заполнил массив
        for (int i = 0; i < sizeMas; i++) {
            int r = random.nextInt(11);
            massiv[i] = r;
        }
        //Проверил все условия
        for (int t : massiv) {
            if (t > 8) amNumEight++;
            if (t == 1) amNumEqOne++;
            if (t % 2 == 0) amEvenNum++;
            else oddEvenNum++;
            sumMass += t;
        }
        //Вывел данные
        System.out.println(Arrays.toString(massiv));
        System.out.println("Информация о массиве:" +
                "\nДлина массива: " + sizeMas +
                "\nКоличество чисел больше 8: " + amNumEight +
                "\nКоличество чисел равных 1: " + amNumEqOne +
                "\nКоличество четных чисел: " + amEvenNum +
                "\nКоличество нечетных чисел: " + oddEvenNum +
                "\nСумма всех элементов массива: " + sumMass);
    }
}
