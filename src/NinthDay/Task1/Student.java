package NinthDay.Task1;

public class Student extends Human {
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот студент с именем %s\n", name);
    }
}

