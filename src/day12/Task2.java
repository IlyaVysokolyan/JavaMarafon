package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = randomArr(0, 30);
        List<Integer> numbers2 = randomArr(300, 350);

        numbers.forEach(s -> System.out.print(s + ","));
        System.out.println();
        numbers2.forEach(s -> System.out.print(s + ","));


    }

    public static ArrayList<Integer> randomArr(int a, int b) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = a; i <= b; i++) {

            int rnd = random.nextInt(a, b) + 1;
            if (rnd % 2 == 0) arr.add(rnd);

        }

        return arr;

    }
}
