package day9;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Иван", "П2-11");
        Teacher teacher = new Teacher("Ольга Ивановна", "Математика");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();


    }
}
