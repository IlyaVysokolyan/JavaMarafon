package day11;

public class Courier implements Worker {

    private Warehouse warehouse;
    private int salary; //заработная плата
    private boolean isPayed = true; // был выплачен бонус или нет
    private final int DEFAULT_SALARY = 100; // фикс зарплата
    private final int BONUS = 50;
    private int countDeliveredOrders;

    public Courier(Warehouse warehouse, int salary) {
        this.warehouse = warehouse;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += DEFAULT_SALARY;
        warehouse.CountDeliveredOrders();
        countDeliveredOrders++;

    }

    @Override
    public void bonus() {

        if (isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10 & countDeliveredOrders >= 1) {
                salary += BONUS;
                isPayed = false;
                System.out.println("Курьеру выплачен бонус");
            } else System.out.println("Бонус пока недоступен!!!");
        } else System.out.println("Бонус уже выплачен!!!");

    }


    @Override
    public String toString() {
        return "ЗП Курьера " + salary;
    }
}
