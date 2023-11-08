package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "Volvo", "WW", "Mercedes", "Chery"));

        cars.forEach(System.out::println);
        cars.add(cars.size()/2, "EXED");
        cars.remove(0);
        System.out.println();
        cars.forEach(System.out::println);
    }
}
