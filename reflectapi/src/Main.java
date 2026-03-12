import java.lang.reflect.Field;
class Employee {
    private String name;
    private int age;
    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Divyansh", 22, "divyansh@gmail.com");
            Class empClass = emp.getClass();
            Field[] fields = empClass.getDeclaredFields();
            for (Field field : fields){
                field.setAccessible(true);
                System.out.println(field.getName() + field.get(emp));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}