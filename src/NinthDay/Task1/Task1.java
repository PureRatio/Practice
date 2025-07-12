package NinthDay.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Олег", "404");
        Teacher teacher = new Teacher("Иван Васильевич", "Biology");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
