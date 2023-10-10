package day6;

public class Airplane {
    private String manufacturer; // изготовитель
    private int year; // год выпуска
    private int length; // длина
    private int weight; // вес
    private int fuel; // количество топлива в баке

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + "\nГод выпуска: " + year + "\nДлина: " + length + "\nВес: " + weight + "\nКоличество топлива в баке: " + getFuel());
    }

    public int fillUp(int n) {
        return fuel += n;
    }
}
