package day11;

public class Tast1 {
    public static void main(String[] args) {
        System.out.println("_____________СОЗДАЛИ 1Й СКЛАД_____________");
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1, 0);
        Picker picker1 = new Picker(warehouse1, 0);

        businessProcess(courier1);
        businessProcess(picker1);

        System.out.println(warehouse1.toString());
        System.out.println(courier1.toString());
        System.out.println(picker1.toString());

        System.out.println("_____________СОЗДАЛИ 2Й СКЛАД_____________");
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2, 0);
        Picker picker2 = new Picker(warehouse2, 0);

        businessProcess(courier2);
        businessProcess(picker2);

        System.out.println(warehouse2.toString());
        System.out.println(courier2.toString());
        System.out.println(picker2.toString());


    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 21; i++) {
            worker.doWork();
        }
        worker.bonus();

    }
}
