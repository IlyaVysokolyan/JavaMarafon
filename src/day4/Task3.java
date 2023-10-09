package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 3;
        int m = 5;
        int[][] array = new int[n][m];
        int sum = 0;
        int max = 0;
        int stroka = 0;


        //Заполнил массив
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                int r = random.nextInt(7);
                array[i][k] = r;
            }
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int k = 0; k < m; k++) {
                sum += array[i][k];
            }
            if (max < sum) {
                max = sum;
                stroka = i;
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма строки: " + max + "\nСтрока №: " + stroka);

    }
}
