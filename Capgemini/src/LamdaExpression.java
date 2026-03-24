import java.util.ArrayList;
import java.util.List;

public class LamdaExpression {
    static class Employee{
        int id;
        String name;
        Employee(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + " - " + name;
        }

    }
    interface Calc{
        int sortByName (Employee n1, Employee n2);
    }
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(1, "Divyansh"));
        list1.add(new Employee(2, "Ayush"));
        list1.add(new Employee(3, "Aditya"));
        list1.add(new Employee(4, "Ratnesh"));
        list1.add(new Employee(5, "Divyansh"));


        Calc c = (n1, n2) -> n1.name.compareTo(n2.name);
        list1.sort((e1, e2) -> c.sortByName(e1, e2));
        System.out.println(list1);

    }
}
