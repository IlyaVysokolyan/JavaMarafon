package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int r = random.nextInt(1, 5) + 1;
        String rating = null;
        if (r == 2) rating = "неудовлетворительно";
        if (r == 3) rating = "удовлетворительно";
        if (r == 4) rating = "хорошо";
        if (r == 5) rating = "отлично";
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + rating);
    }
}
