package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2006, 33, 1205);
        airplane.setYear(2000);
        airplane.setLength(25);
        airplane.fillUp(10);
        airplane.fillUp(14);

        airplane.info();
    }
}
