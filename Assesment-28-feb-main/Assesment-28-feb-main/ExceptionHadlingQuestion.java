import java.util.HashMap;
class UsernameExistsException extends RuntimeException {
    public UsernameExistsException(String message) {
        super(message);
    }
}
class UserMap extends HashMap<String, String> {
    @Override
    public String put(String key, String value) {
        if (this.containsKey(key)) {
            throw new UsernameExistsException(
                "Username already exists: " + key
            );
        }
        return super.put(key, value);
    }
}
public class Main {
    public static void main(String[] args) {
        UserMap users = new UserMap();
        try {
            users.put("Priyanshu", "1234");
            users.put("Aditya", "abcd");
            users.put("Priyanshu", "9999");
        } catch (UsernameExistsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Stored Users: " + users);
    }
}
