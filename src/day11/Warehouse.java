package day11;

public class Warehouse {
    private int countPickedOrders; // количество собранных заказов
    private int countDeliveredOrders; // количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int CountPickedOrders() {
        return countPickedOrders += 1;
    }

    public int CountDeliveredOrders() {
        return countDeliveredOrders += 1;
    }


    @Override
    public String toString() {
        return "Кол-во собранных заказов на складе " + countPickedOrders +
                "\nКол-во доставленных заказов со склада " + countDeliveredOrders;
    }
}
