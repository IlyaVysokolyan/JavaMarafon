package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int sizeArray = 100;
        int[] array = new int[sizeArray];
        int maxSum = 0; // Максимальная сумма тройки
        int sumElement = 0; // Запись и сравнение с максимальной суммой тройки
        int count = 0; // счетчик троек
        int startNumber = 0; // запись индекса тройки с max суммой

        //Заполнил массив
        for (int i = 0; i < sizeArray; i++) {
            int r = random.nextInt(10000);
            array[i] = r;
        }

        // Выполнение условий
        for (int i = 0; i < sizeArray; i++) {
            for (int k = i; k <= sizeArray; k++) {
                if (count == 3 || k == sizeArray) {
                    count = 0;
                    sumElement = 0;
                    break;
                }
                sumElement += array[k];
                count++;
                if (sumElement > maxSum) {
                    maxSum = sumElement;
                    startNumber = k - 2;
                }

            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + startNumber);


    }
}
