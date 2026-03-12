import java.io.Serializable;

public class Student implements Serializable {
    int rollno;
    String name;
    int marks;

    public Student(String  name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", marks=" + marks +
                '}';
    }
}
