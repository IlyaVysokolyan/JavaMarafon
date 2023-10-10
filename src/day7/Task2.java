package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player(randomStamina());
        Player player2 = new Player(randomStamina());
        Player player3 = new Player(randomStamina());
        Player player4 = new Player(randomStamina());
        Player player5 = new Player(randomStamina());
        Player player6 = new Player(randomStamina());
        Player player7 = new Player(randomStamina());
        Player player8 = new Player(randomStamina());

        player2.info();
        System.out.println(player3.getStamina());
        System.out.println(player1.getStamina());
        player3.run();
        player1.run();
        player2.info();


    }

    public static int randomStamina() {
        Random random = new Random();
        int r = 0;
        return r = random.nextInt(90, 100) + 1;
    }
}
