package day8;

public class Task1 {
    public static void main(String[] args) {

        String1();
        StringBuilder1();

    }

    public static void StringBuilder1() {
        long start = System.currentTimeMillis();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i <= 20; i++) {
            st.append(" ").append(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println(st.toString()
                + "\nДлительность работы, в мс.: " + (stop - start) + " Класс StringBuilder");
    }

    public static void String1() {
        long start = System.currentTimeMillis();
        String st = "";
        for (int i = 0; i <= 20; i++) {
            st += " " + i;
        }
        long stop = System.currentTimeMillis();
        System.out.println(st.toString()
                + "\nДлительность работы, в мс.: " + (stop - start) + " Класс String");
    }
}

