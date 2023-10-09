package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int sizeArray = 100;
        int[] array = new int[sizeArray];

        //Заполнение массива
        for (int i = 0; i < sizeArray; i++) {
            int random = r.nextInt(10001);
            array[i] = random;
        }

        int maxNum = array[0];
        int minNum = array[0];
        int countZero = 0;
        int sumCountZero = 0;

        //Выполнение условий
        for (int t : array) {
            if (t > maxNum) maxNum = t;
            if (t < minNum) minNum = t;
            if (t % 10 == 0) {
                countZero++;
                sumCountZero += t;
            }
        }
        //Вывод результата
        System.out.println("Вывод массива: " + Arrays.toString(array) +
                "\nНаибольший элемент массива: " + maxNum +
                "\nНаименьший элемент массива: " + minNum +
                "\nКол-во элементов массива, оканчивающихся на 0: " + countZero +
                "\nСумма элементов массива, оканчивающихся на 0: " + sumCountZero);
    }
}
