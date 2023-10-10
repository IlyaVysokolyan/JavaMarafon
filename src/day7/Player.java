package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) countPlayers = 6;

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        System.out.println("Кол-во игроков на поле: " + getCountPlayers());
        for (int i = 0; ; i++) {
            stamina -= 1;
            System.out.println("Игрок бежит " + this.toString());
            if (stamina == MIN_STAMINA) {
                countPlayers -= 1;
                break;
            }
        }
        System.out.println("Игрок ушел с поля " + this.toString());
        System.out.println("Кол-во игроков на поле: " + countPlayers);
    }

    public void info() {
        if (countPlayers == 6)
            System.out.println("На поле нет свободных мест");
        if (countPlayers == 5)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
        if (countPlayers == 2 || countPlayers == 3 || countPlayers == 4)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
        if (countPlayers == 1)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
    }

}
