package SixthDay;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

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
        int grade = random.nextInt(4)+2;
        String gradeString = "";

        switch (grade) {
            case 2:
                gradeString = "неудовлетворительно";
                break;
            case 3:
                gradeString = "удовлетворительно";
                break;
            case 4:
                gradeString = "хорошо";
                break;
            case 5:
                gradeString = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s", name, student.getName(), subject, gradeString);
    }
}
