package day11;

public class Picker implements Worker {

    private Warehouse warehouse;
    private int salary; //заработная плата
    private boolean isPayed = true; // был выплачен бонус или нет
    private final int DEFAULT_SALARY = 80; // фикс зарплата
    private final int BONUS = 70;

    private int countPickedOrders;


    public Picker(Warehouse warehouse, int salary) {
        this.warehouse = warehouse;
        this.salary = salary;

    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        this.salary += DEFAULT_SALARY;
        warehouse.CountPickedOrders();
        countPickedOrders++;
    }

    @Override
    public void bonus() {

        if (isPayed) {
            if (warehouse.getCountPickedOrders() >= 10 & countPickedOrders >= 1) {
                salary += BONUS;
                isPayed = false;
                System.out.println("Сборщику выплачен бонус");
            } else System.out.println("Бонус пока недоступен!!!");
        } else System.out.println("Бонус уже выплачен!!!");
    }

    @Override
    public String toString() {
        return "ЗП Сборщика " + salary;
    }
}
