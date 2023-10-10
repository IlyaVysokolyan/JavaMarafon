package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Татьяна Петровна", "Литература");
        Student student = new Student("Алексей Иванов");
        teacher.evaluate(student);
    }
}
