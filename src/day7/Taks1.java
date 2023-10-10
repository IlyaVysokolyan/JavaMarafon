package day7;

public class Taks1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing 237", 2020, 27, 1000);
        Airplane airplane2 = new Airplane("Boing 238", 2020, 30, 1000);
        Airplane.compareAirplanes(airplane2, airplane);
    }
}
